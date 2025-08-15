import java.util.*;

public class dec_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);wa
        int n = sc.nextInt();
        int[] bin = new int[32];
        int i = 0;
        while (n>0) {
            bin[i] = n%2;
            n = n/2;
            i++;
        }
        for (int j = i-1; j>=0; j--) {
            System.out.print(bin[j]);
        }
    }
}
