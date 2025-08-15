import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            //Space
            for (int j = 0; j < i*2; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < n-i; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
