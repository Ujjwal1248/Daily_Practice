package Practice;
import java.util.*;;
public class R4Pattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int row = 1;
            int star = 1;
            while (row <= n) {
                int i = 1;
                while(i<=star){
                    System.out.print("*");
                    i++;
                }
                System.out.println();
                row++;
                star++;
            }
        }
    }
}
