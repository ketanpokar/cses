package cses;

import java.util.Scanner;

public class MissingNumber {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long res = 0;
        long resu = 0;
        for(int i=0;i<n-1;i++){
            res = s.nextLong();
            resu = resu+res;
        }
        long total = (n*(n+1))/2;

        System.out.println(total-resu);
    }
}
