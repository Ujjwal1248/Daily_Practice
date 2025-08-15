/* 
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
 */
package Practice;
import java.util.Scanner;
public class Pascal_Triangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int rows = 1;
            int val = 1;
            while (rows<=n){
                int row = 1;
                int col = 1;
                while (row<=val){
                    if(row<=col){
                        System.out.print("1");
                    }
                    System.out.print(val+" ");
                    row++;
                    col++;
                }
                System.out.println();
                rows++;
                val++;
            }
        }
    
    }
}
