/*
print a hollow rhombus

    *****
   *   *
  *   *
 *   *
*****


*/

public class hw5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= n; j++) {
                if (j==1 || j==n || i==1 || i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}