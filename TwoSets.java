// Problem link : https://cses.fi/problemset/task/1092

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoSets {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long startTime = System.currentTimeMillis();
        Set<Long> firstSet = new HashSet<>();
        Set<Long> secondSet = new HashSet<>();
        long totalSum = (n*(n+1)/2);
        if(totalSum % 2 != 0) {
            System.out.println("NO");
        } else {
            long count = 0, i = 1, extraNum = 0;
            for( ; i <= n ; i++) {
                firstSet.add(i);
                count = count + i;
                if(count > totalSum / 2) {
                    extraNum = count - totalSum / 2;
                    firstSet.remove(extraNum);
                    break;
                }
            }
            i++;
            secondSet.add(extraNum);
            for(; i <= n ; i++) {
                secondSet.add(i);
            }
            System.out.println("YES");
            System.out.println(firstSet.size());
            firstSet.stream().forEach(e -> System.out.print(e + " "));
            System.out.println();
            System.out.println(secondSet.size());
            secondSet.stream().forEach(e -> System.out.print(e + " "));
            System.out.println(System.currentTimeMillis() - startTime);
        }

    }



    // 7  => {1,2,4,7}, {3,5,6} => {1,5,7}, {2,4,6,3}
    // 8 = > {2,4,5,7},{1,3,6,8}

}
