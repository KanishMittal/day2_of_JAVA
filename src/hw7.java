/*
Print half Pyramid.
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

*/

public class hw7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
