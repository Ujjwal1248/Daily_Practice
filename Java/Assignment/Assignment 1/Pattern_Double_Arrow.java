package Practice;

import java.util.Scanner;

public class Pattern_Double_Arrow{

   public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n = n1/2+1;  
            int Out_space = 2 * n - 2;
            int In_space = -1;
            int row = 1;
            while (row <= n) {
                int i = 1;
                while (i <= Out_space) {
                    System.out.print("  ");
                    i++;
                }

                int j = 1;
                int val1 = row;
                while (j <= row) {
                    System.out.print(val1 + " ");
                    val1--;
                    j++;
                }

                int k = 1;
                while (k <= In_space) {
                    System.out.print("  ");
                    k++;
                }

                if (row != 1) {
                    int val2 = 1;
                    int p = 1;
                    while (p <= row) {
                        System.out.print(val2 + " ");
                        val2++;
                        p++;
                    }
                }

                if (row < n) {
                    Out_space -= 2;
                    In_space += 2;
                } else {
                    Out_space += 2;
                    In_space -= 2;
                }
                System.out.println();
                row++;
            }

            row = n - 1;
            Out_space = 2;
            In_space = 2 * row - 3;

            while (row >= 1) {
                int i = 1;
                while (i <= Out_space) {
                    System.out.print("  ");
                    i++;
                }

                int j = 1;
                int val1 = row;
                while (j <= row) {
                    System.out.print(val1 + " ");
                    val1--;
                    j++;
                }

                int k = 1;
                while (k <= In_space) {
                    System.out.print("  ");
                    k++;
                }

                if (row != 1) {
                    int val2 = 1;
                    int p = 1;
                    while (p <= row) {
                        System.out.print(val2 + " ");
                        val2++;
                        p++;
                    }
                }

                Out_space += 2;
                In_space -= 2;
                System.out.println();
                row--;
            }
            sc.close();
        }
    }
}
