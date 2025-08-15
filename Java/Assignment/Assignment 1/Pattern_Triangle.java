//      1 
//    2 3 2
//  3 4 5 4 3
// 4 5 6 7 6 5 4



package Practice;
import java.util.Scanner;

public class Pattern_Triangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int row = 1;

            while(row <= n){
                // Print leading spaces
                int space = n - row;
                while(space > 0){
                    System.out.print("  ");
                    space--;
                }

                // Print increasing numbers
                int val = row;
                int j = 1;
                while(j <= row){
                    System.out.print(val + " ");
                    val++;
                    j++;
                }

                // Print decreasing numbers
                val = val - 2;
                j = 1;
                while(j < row){
                    System.out.print(val + " ");
                    val--;
                    j++;
                }

                // Move to the next line
                System.out.println();
                row++;
            }
        }
    }
}
