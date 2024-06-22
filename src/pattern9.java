/*
Print the following pattern:

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++ ){
            for (int j = 1; j <= i; j++){
                if ((i+j)%2 == 0) {
                    //even position
                    System.out.print("1 ");
                }
                else {
                    //odd position
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}