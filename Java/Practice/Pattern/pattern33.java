/*Print the following pattern
0
9 0 9
8 9 0 9 8
7 8 9 0 9 8 7
6 7 8 9 0 9 8 7 6
5 6 7 8 9 0 9 8 7 6 5
4 5 6 7 8 9 0 9 8 7 6 5 4
3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1
*/
public class pattern33 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            //Space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            // In middle it should be 0 always
            for (int j = 0; j<i+1; j++) {
                System.out.print(n-j + " ");
            }
            //The counting should be resversed from 9 to 1
            for (int j = 1; j <= i; j++) {
                System.out.print(n-j + " ");
            }

            System.out.println();
        }
    }
}
