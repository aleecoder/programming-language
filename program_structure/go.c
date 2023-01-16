#include <stdio.h>
#include "max.h"
#include "max.c"
int g = 90;
int main() {
    printf("%d", max(10, g));
    return 0;
}