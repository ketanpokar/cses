package cses;

import java.util.Scanner;

public class BeautifulPermitation {

    // Get a number series for which the difference between 2 adjacent numbers should be 1
    //7 ->   1,3,5,2,4
    // 3 -> 1,3,2   2, 1, 3
    // 4 -> 1,3,2,4     2,4,1,3
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n < 4) {
            System.out.println("NO SOLUTION");
            return;
        }

        for(int j = 2 ; j <= n ; j += 2) {
            System.out.print(j + " ");
        }

        for(int i = 1 ; i <= n ; i += 2) {
            System.out.print(i + " ");
        }
    }

}
