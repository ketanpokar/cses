#include <stdio.h>
#include<math.h>

int main() {
    // Write C code here

        long long int t;
        scanf("%lld",&t);
        while(--t >= 0) {
            long long int r,c,res = 0;
            //printf("Enter x ");
            scanf("%lld",&r);
            //printf("Enter y ");
            scanf("%lld",&c);
            if(r > c) {
                if(r % 2 == 0) {
                    res = r*r;
                    res = res - c + 1;
                } else {
                    res = (r-1)*(r-1) + 1;
                    res = res + c -1;
                }
            } else if(r < c) {
                if(c % 2 == 0) {
                    res = (c-1)*(c-1) + 1;
                    res = res + r - 1;
                } else {
                    res = c*c;
                    res = res - r + 1;
                }
            } else {
                if(r % 2 == 0) {
                    res = r*r;
                    res = res - r + 1;
                } else {
                    res = c*c;
                    res = res - r + 1;
                }
            }
            printf("%lld\n",res);
        }
}