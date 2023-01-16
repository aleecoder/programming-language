#include <stdio.h>

//x^n
int NthPower(int x, int n) {
    int p = 1;
    while (n--) {
        p *= x;
    }
    return p;
}

int main() {
    int n;
    scanf("%d", &n);
    int first = 1, i = 1;
    while (i++ < n) {
        first *= 10;
    }
    i = first;
    //比如n=3,遍历100-999
    while (i < first * 10) {
        int num = i, sum = 0;
        do {
            int d = num % 10;
            num /= 10;
            sum += NthPower(d, n);
        } while (num > 0);
        if (sum == i) {
            printf("%d\n", i);
        }
        i++;
    }
    return 0;
}