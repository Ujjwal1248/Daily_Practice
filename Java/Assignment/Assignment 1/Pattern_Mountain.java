/* 
                1           1
                1 2       2 1  
                1 2 3   3 2 1
                1 2 3 4 3 2 1 
 */
package Practice;
import java.util.Scanner;
public class Pattern_Mountain {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int row = 1;
            int star = 1;
            int space = 2 * n - 3;
            while (row <= n) {
                int i = 1;
                while (i <= star) {
                    System.out.print(i + "\t");
                    i++;
                }
                //space
                int j = 1;
                while (j <= space) {
                    System.out.print("\t");
                    j++;
                }
                int k = 1;
                if (row == n) {
                    k = 2;
                }
                while (k <= star) {
                    System.out.print((star - k + 1) + "\t");
                    k++;
                }
                System.out.println();
                row++;
                star++;
                space -= 2;
            }
        }
    }
}
