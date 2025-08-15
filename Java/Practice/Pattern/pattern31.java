public class pattern31 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                if (j == i+1) {
                    System.out.print("*" + "\t");
                }
                else {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
    }
}
