/*
Print the following pattern (Number Pyramid)

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/

public class hw2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            //for space
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            //for numbers
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}