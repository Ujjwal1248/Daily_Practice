public class pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;
        for (int i = 0; i < n; i++) {
            //Space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" "+"\t");
            }
            //Star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(sum+"\t");
                sum++;
            }
            System.out.println();
        }
    }
}
