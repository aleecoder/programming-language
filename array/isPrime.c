#include <stdio.h>

#define NUMBER 100

int isPrime(int x, int knownPrimes[], int numberOfKnownPrimes);

void format(int i);

//判断是否能被已知的且小于x的素数整除
int main() {
    int prime[NUMBER] = {2};
    int count = 1;
    int i = 3;
    while (count < NUMBER) {
        if (isPrime(i, prime, count)) {
            prime[count++] = i;
        }
        i++;
    }
    for (i = 0; i < NUMBER; i++) {
        printf("%d", prime[i]);
        format(i);
    }
    return 0;
}

int isPrime(int x, int knownPrimes[], int numberOfKnownPrimes) {
    int ret = 1;
    for (int i = 0; i < numberOfKnownPrimes; ++i) {
        if (x % knownPrimes[i] == 0) {
            ret = 0;
            break;
        }
    }
    return ret;
}

void format(int i) {
    if ((i + 1) % 5) {
        printf("\t");
    } else {
        printf("\n");
    }
}