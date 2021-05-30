package cses;

import java.util.Scanner;

public class NumberSpiral {


    //Input

//            01,02,09,10,25,26,49,50
//            04,03,08,11,24,27,48,51
//            05,06,07,12,23,28,47,52
//            16,15,14,13,22,29,46,53
//            17,18,19,20,21,30,45,54
//            36,35,34,33,32,31,44,55
//            37,38,39,40,41,42,43,56
//            64,63,62,61,60,59,58,57

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        for(int i = 0 ; i < t ; i++) {
            System.out.println(i);
            //long row = s.nextLong();
            long r = s.nextLong();
            //BigInteger r = new BigInteger(String.valueOf(row));
            //long col = s.nextLong();
            long c = s.nextLong();
            //BigInteger c = new BigInteger(String.valueOf(col));
            //BigInteger res = null;
            long res = 0;
//            if(r.compareTo(c) > 0) {
            if(r > c) {
//                if(r.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)) == 0) {
                if(r % 2 == 0 ) {
//                    res = r.pow(2);
                    res = r*r;
//                    res = (res.subtract(c)).add(BigInteger.valueOf(1));
                    res = res - c + 1;
                } else {
                    res = (r-1)*(r-1) + 1;
//                    res = r.subtract(BigInteger.valueOf(1)).pow(2).add(BigInteger.valueOf(1));
                    res = res + c -1;
//                    res = (res.add(c)).subtract(BigInteger.valueOf(1));
                }
//            } else if(r.compareTo(c) < 0) {
            } else if (r < c) {
//                if(c.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)) == 0) {
                if(c % 2 == 0) {
                    res = (c-1)*(c-1) + 1;
//                    res = c.subtract(BigInteger.valueOf(1)).pow(2).add(BigInteger.valueOf(1));
                    res = res + r - 1;
//                    res = (res.add(r)).subtract(BigInteger.valueOf(1));
                } else {
                    res = c*c;
//                    res = c.pow(2);
                    res = res - r + 1;
//                    res = (res.subtract(r)).add(BigInteger.valueOf(1));
                }
            } else {
//                if(r.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)) == 0) {
                if(r % 2 == 0){
                    res = r*r;
//                    res = r.pow(2);
                    res = res - r + 1;
//                    res = (res.subtract(r)).add(BigInteger.valueOf(1));
                } else {
                    res = c*c;
//                    res = c.pow(2);
                    res = res - c + 1;
//                    res = (res.subtract(r)).add(BigInteger.valueOf(1));
                }
            }
            System.out.println(res);
        }
    }

}
