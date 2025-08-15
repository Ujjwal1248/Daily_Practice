import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        int n = 14;
        for (int i = 0; i < n; i++) {
            //SPace
            for (int j = 0; j < n-i-1 ; j++) {
                System.out.print(" "+"\t");
            }
            //star
            for (int j = 2; j < 2*i+3; j++) {
                if (j%2==0) {
                    System.out.print("*"+"\t");
                }
                else{
                    System.out.print("!"+"\t");
                }
            }
            System.out.println();
        }

    }
}
