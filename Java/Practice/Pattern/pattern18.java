public class pattern18 {
    public static void main(String[] args) {
        int n = 17;
        for (int i = 0; i < n/2+1; i++) {
            //Space
            for (int j = 0; j < n/2-i; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        //Space
        for (int i = 0; i < n/2; i++) {
            //Space
            for (int j = 0; j < i+1; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < n-2*(i+1); j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
