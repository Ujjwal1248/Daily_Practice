import java.util.*;
public class pattern15 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            //Space
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < n-i; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = n + 1 - (i * 2); j > 0; j--) {
                System.out.print(" "+"\t");
            }
            for (int j = 0; j <= i+1; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
