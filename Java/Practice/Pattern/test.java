public class test {
    // **
    // ***
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n/2-1; i++) {
            for (int j = 0; j < i+2; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
