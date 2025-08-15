public class prime {
    public static void main(String[] args) {
        int n = 42;
        int count = 0;
        for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
        if(count>=1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
