#include <stdio.h>
#include <string.h>

int main() {
    int ch;
    //Windows: Ctrl-Z¶Áµ½EOF
    //Linux: Ctrl-D¶Áµ½EOF
    while ((ch = getchar()) != EOF) {
        putchar(ch);
    }
    printf("EOF!!!");
    return 0;
}