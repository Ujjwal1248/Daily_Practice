/* 
        *********
        **** ****
        ***   ***
        **     **
        *       *
        **     **
        ***   ***
        **** ****
        ********* 
*/
package Practice;

import java.util.Scanner;

public class Pattern_Magic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // Number of rows for the upper half

            // Print the upper half of the pattern
            int row = 1;
            int space = -1;
            int star = n;

            while (row <= n) {
                // Task 1 (star)
                int i = 1;
                if (row==1){
                    i = 2;
                }
                while (i <= star) {
                    System.out.print("*");
                    i++;
                }

                // Task 2 (space)
                int j = 1;
                while (j <= space) {
                    System.out.print(" ");
                    j++;
                }

                // Task 3 (star)
                int k = 1;
                while (k <= star) {
                    System.out.print("*");
                    k++;
                }

                System.out.println();
                row++;
                star--;
                space += 2;
            }

            // Printing the lower half
            row = n;
            space -= 2;
            star = 1;

            while (row >= 1) {
                // Task 1 (star)
                int i = 1;
                while (i <= star) {
                    System.out.print("*");
                    i++;
                }

                // Task 2 (space)
                int j = 1;
                while (j <= space) {
                    System.out.print(" ");
                    j++;
                }

                // Task 3 (star)
                int k = 1;
                if (row ==1){
                    k=2;
                }
                while (k <= star) {
                    System.out.print("*");
                    k++;
                }

                System.out.println();
                row--;
                star++;
                space -= 2;
            }
        }
    }
}
