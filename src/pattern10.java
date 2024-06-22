/*

*______*
**____**
***__***
********
********
***__***
**____**
*______*

*/

public class pattern10{
    public static void main(String[] args){
        int n = 4;

        //First part-Upper Half
        for (int i = 1; i <= n; i++) {
            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //for spaces
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }

            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Second part-Lower Half
        for (int i = n; i >= 1; i--) {
            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //for spaces
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }

            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
