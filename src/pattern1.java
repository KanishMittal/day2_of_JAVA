/*
Print the following pattern (Solid Rectangle)
*****
*****
*****
*****

 */

public class pattern1 {
    public static void main(String[] args) {
        //outer loop
        for (int i = 1; i <= 4; i++) {
            //inner loop
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}