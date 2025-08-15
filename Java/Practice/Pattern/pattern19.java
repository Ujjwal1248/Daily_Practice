public class pattern19 {
    public static void main(String[] args) {
        int n = 7;
        //Line
        for (int i = 0; i < n; i++) {
            System.out.print("*"+"\t");
        }
        System.out.println();
        for (int i = 0; i < n/2; i++) {
            //Star
            for (int j = 0; j < n/2-i; j++) {
                System.out.print("*"+"\t");
            }
            //Space
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < n/2-i; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n/2-1; i++) {
            //Star
            for (int j = 0; j < i+2; j++) {
                System.out.print("*"+"\t");
            }
            //Space
            for (int j = 0; j < n-2*(i+2); j++) {
                System.out.print(" "+"\t");
            }

            //Star
            for (int j = 0; j < i+2; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        //Line
        for (int i = 0; i < n; i++) {
            System.out.print("*"+"\t");
        }
    }
}
