import java.util.*;
public class pattern10 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            //Space
            for (int j = 0; j < i ; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
