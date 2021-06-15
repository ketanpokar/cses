// Problem Link : https://cses.fi/problemset/task/1634/

//package com.example.codesnippets.competitiveprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MinimizingCoins {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int x = sca.nextInt();
        int coins[] = new int[n];
        for(int i = 0; i < n; i++) {
            coins[i] = sca.nextInt();
        }
       // System.out.println(minimizeCoins(coins, x, 0));
//        int res = minCoins(coins, x, 0, 0);
        int res = minCoinTab(coins, x);
        System.out.println(res);
    }

    static List<List<Integer>> minimizeCoins(int[] coins, int x, int sum) {

        if(sum == x) return new ArrayList<>();
        if(sum > x) return null;

        List<List<Integer>> result = null;

        for(int coin : coins) {

            List<List<Integer>> combinations = minimizeCoins(coins, x, sum + coin);
            if(combinations != null) {
                if(result == null) result = new ArrayList<>();
                if(combinations.size() == 0) combinations.add(new ArrayList<>());

                for(List<Integer> combination : combinations) {
                    combination.add(coin);
                }
                result.addAll(combinations);
            }
        }
        return result;
    }

    static int minCoins(int[] coins, int x, int sum, int total) {

        if(sum == x) return total;
        if(sum > x) return -1;

        int min = -1;
        for(int coin : coins) {

            int retValue = minCoins(coins, x, sum + coin, total + 1);

            if(min == -1 && retValue != min)
                min = retValue;

            if(retValue < min && retValue != -1)
                min = retValue;
        }
        return min;
    }

    static int minCoinTab(int[] coins, int x) {

        int[] dp = new int[x+1];
        for(int i = 1; i < x+1; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        for(int i = 0; i <= x; i++) {
            if(dp[i] != -1){
                for(int j = 0 ; j < coins.length; j++) {
                    if(i + coins[j] <= x) {
                        if(dp[i + coins[j]] != -1 && dp[i + coins[j]] > dp[i] + 1) {
                            dp[i + coins[j]] = dp[i] + 1;
                        } else if(dp[i + coins[j]] == -1) {
                            dp[i + coins[j]] = dp[i] + 1;
                        }
                    }
                }
            }
        }
        return dp[x];
    }

}
