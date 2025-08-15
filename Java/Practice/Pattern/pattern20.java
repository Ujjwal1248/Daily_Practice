/*
 int n = 7;
 Print the following pattern
            *
        *       *
    *               *
*                       *
    *               *
        *       *
            *
*/
public class pattern20 {
    public static void main(String[] args) {
        int n = 27;
        for (int i = 0; i < n/2+1; i++) {
            //Space
            for (int j = 0; j < n/2-i; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < 2*i+1; j++) {
                if (j==0||j==2*i) {
                    System.out.print("*"+"\t");
                }
                else{
                    System.out.print(" "+"\t");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n/2; i++) {
            //Space
            for (int j = 0; j < i+1; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < n-(i+1)*2; j++) {
                if (j==0|| j==(n-1)-(i+1)*2) {
                    System.out.print("*"+"\t");
                }
                else{
                    System.out.print(" "+"\t");
                }
            }
            System.out.println();
        }
    }
}
