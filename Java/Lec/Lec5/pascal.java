import java.util.Scanner;

public class pascal {
    /*
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     * 1 5 10 10 5 1
     */
    public static void main(String[] args) {
        int n = 6;

        for (int row = 1; row <= n; row++) {
            int ncr = 1;
            for (int i = 1; i <= row; i++) {
                System.out.print(ncr + " ");
                ncr = (ncr * (row - i)) / i;
            }
            System.out.println();
        }

    }
}
