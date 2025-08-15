public class nthprime {
    public static void main(String[] args) {
        prime(3);
    }
    public static void prime(int num){
        int count = 0;
        for (int i = 2; i < num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i-1; j++) {
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
            if (count == num) {
                System.out.println(i);  // Print the nth prime number
                break;  // Exit the loop once the nth prime is found
            }
        }
    }
}
