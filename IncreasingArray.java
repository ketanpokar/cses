package cses;

import java.util.Scanner;

public class IncreasingArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long[] a = new long[(int)n];

        for(int i = 0 ; i < n ; i++) {
            a[i] = s.nextInt();
        }
        long result = 0;
        for(int i = 1 ; i < n ; i++) {
            if(a[i] < a[i-1]) {
                result = result + (a[i-1] - a[i]);
                a[i] = a[i] + a[i-1] - a[i];
            }
        }

        System.out.println(result);

    }

}
