import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        int n = 3455447;
        int target = 4;
        int n1 = n;
        //3455447
        // int n1 = String.parseInt(n);
        int count = 0;
        while (n1>0) {
            if(n1%10==target){
                count++;
                n1/=10;
            }
        }
        System.out.println(count);
    }
}
