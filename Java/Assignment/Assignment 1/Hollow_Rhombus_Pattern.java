//      *****
//     *   *
//    *   *
//   *   *
//  *****
package Practice;
import java.util.Scanner;
public class Hollow_Rhombus_Pattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int space = n/2+2;
            int row = 1;
            while(row <= n) {
                //space
                int i = 1;
                while(i<=space){
                    System.out.print("  ");
                    i++;
                }
                //star
                int j = 1;
                while(j<=n){
                    if (row==1 || row==n){
                        System.out.print("* ");    
                    }else{
                        if(j==1||j==n){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    j++;
                }
                
                System.out.println();
                row++;
                space--;

                
            }

        }
    }
}
