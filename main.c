#include <stdio.h>

const int AMOUNT = 100;     //定义常量

int main() {
    int price = 0;
    scanf("%d", &price);
    printf("Hello, World!\n");
    printf("Your account balance is %d.", AMOUNT - price);
    return 0;
}
