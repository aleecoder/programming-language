#include <stdio.h>

int main() {
    int number;
    scanf("%d", &number);
    unsigned mask = 1u << 31;
    while (mask) {
        printf("%d", number & mask ? 1 : 0);
        mask >>= 1;
    }
    return 0;
}