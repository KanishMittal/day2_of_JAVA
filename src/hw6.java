/*
Print Pascal’s Triangle.

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

 */

public class hw6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int value = 1;
            for (int j = 0; j <= i; j++) {
                // Print the current value
                System.out.print(value + " ");

                // Calculate the next value
                value = value * (i - j) / (j + 1);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
