import java.util.*;
public class pattern7 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            //Star
            if (i == 0 || i==n-1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*"+"\t");
                }
            }
            else {
                //Star
                System.out.print("*"+"\t");
                //Space
                for (int j = 0; j < n-2; j++) {
                    System.out.print(" "+"\t");
                }
                //Star
                System.out.print("*"+"\t");
            }
            System.out.println();

        }
    }
}
