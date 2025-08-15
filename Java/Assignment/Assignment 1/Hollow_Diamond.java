// Take N (number of rows), print the following pattern (for N = 5).
//      * * * * *
//      * *   * *
//      *       *
//      * *   * *
//      * * * * *
package Practice;
import java.util.*;

public class Hollow_Diamond {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int row = 1;
            int star = n / 2 + 1;
            int space =-1;
            if(n%2==0){
                n++;
            }
            
            while (row <= n) {
                //star
                int i = 1;
                while (i <= star) {
                    System.out.print("* ");
                    i++;
                }
                
                //space
                int j = 1;
                while (j <= space) {
                    System.out.print("  ");
                    j++;
                }
                
                //star
                int k = 1;
                if (row == 1 || row==n){
                    k = 2;
                }
                while (k <= star) {
                    System.out.print("* ");
                    k++;
                }
                
                //mirroring
                if (row < n / 2 + 1) {
                    star--;
                    space+=2;
                } else {
                    star++;
                    space -=2;
                }
                
                System.out.println();
                row++;
            }
        }
    }
}
