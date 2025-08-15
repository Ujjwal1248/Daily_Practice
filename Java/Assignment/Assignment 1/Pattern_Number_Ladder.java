// 1
// 2 3
// 4 5 6
// 7 8 9 10
package Practice;

import java.util.*;

public class Pattern_Number_Ladder {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int row = 1;
            int star = 1;
            int val = 1;
            while (row <= n) {
                int i = 1;
                while (i <= star) {
                    System.out.print(val + " ");
                    i++;
                    val++;
                }
                System.out.println();
                row++;
                star++;
            }
        }
    }
}
