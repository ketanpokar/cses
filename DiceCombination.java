// Problem Link : https://cses.fi/problemset/task/1633/

import java.util.*;
public class DiceCombinations {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int a[] = {1, 2, 3, 4, 5, 6};
        //int res = (int)find(a,n,n) % 1000000007;
//        System.out.println(res);
        System.out.println(findTwo(a, n));
    }
    static Map<Integer, Long> memo = new HashMap<>();
    static long find(int[] possibilities, int n, int total) {
        if(memo.containsKey(total)) return memo.get(total);
        if(total == 0) return 1;
        if(total < 0) return 0;
        long res = 0;
        for(int i = possibilities.length - 1; i >= 0; i--) {
            long temp = find(possibilities, n, total - possibilities[i]);
            if(temp > 0) {
                memo.put(total - possibilities[i], temp);
                res = res + temp;
            }
        }
        return res % 1000000007;
    }

    static long findTwo(int[] possibilities, int n) {
        int[] res = new int[n + 1];
        res[0] = 1;
        for(int i = 1; i < res.length; i++) {
            res[i] = 0;
            for(int j = 0 ; j < possibilities.length; j++) {
                if(i - possibilities[j] >= 0)
                    res[i] = (res[i] + res[i - possibilities[j]]) % 1000000007;
            }
        }

        return res[n];
    }
}
