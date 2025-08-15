public class pattern21 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            //Star
            for (int j = 0; j < i; j++) {
                System.out.print("*"+"\t");
            }
            //Space
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < i; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 2*n-1; i++) {
            System.out.print("*"+"\t");
        }
    }
}
