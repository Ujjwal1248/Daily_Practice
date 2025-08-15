public class pattern29 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            //Space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < 2*i+1; j++) {
                if (j==0||j==2*i) {
                    System.out.print(i+1+"\t");
                }
                else{
                    System.out.print(0+"\t");
                }
            }
            System.out.println();
        }
    }
}
