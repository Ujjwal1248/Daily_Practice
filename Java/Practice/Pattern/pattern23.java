public class pattern23 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            //Space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(1+"\t");
            }
            System.out.println();
        }
    }
}
