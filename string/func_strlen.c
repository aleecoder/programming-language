#include <stdio.h>
#include <string.h>

int _strlen(const char *str) {
    int idx = 0;
    while (str[idx] != '\0') {
        idx++;
    }
    return idx;
}

int main() {
    char line[] = "hello the world";
    printf("strlen=%llu\n", strlen(line));
    printf("_strlen=%d\n", _strlen(line));
    printf("sizeof=%llu\n", sizeof(line));
    return 0;
}