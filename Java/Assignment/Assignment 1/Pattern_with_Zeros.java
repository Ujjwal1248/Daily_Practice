package Practice;
/* 1
2 2
3 0 3
4 0 0 4
5 0 0 0 5 */

import java.util.*;
public class Pattern_with_Zeros {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int row = 1;
            while (row<=n){
                int i = 1;
                while (i<=row){
                    if (i==1 || i==row){
                        System.out.print(row+" ");
                    }else{
                        System.out.print("0 ");
                    }
                    i++;
                }
                System.out.println();
                row++;
            }
        }
    }
}
