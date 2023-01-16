#include <stdio.h>

#define SIZE 10

//输入数量不确定的[0,9]范围内的整数，统计每一种数字出现的次数。输入-1表示结束
int main() {
    int x = 0;
    int counts[SIZE] = {};
    while (x != -1) {
        scanf("%d", &x);
        counts[x]++;
    }
    for (int i = 0; i < SIZE; ++i) {
        printf("%d:%d\n", i, counts[i]);
    }
    return 0;
}