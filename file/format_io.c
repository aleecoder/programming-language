#include <stdio.h>

int main() {
    FILE *fp = fopen("../README.md", "r");
    if (fp) {
        int num;
        fscanf(fp, "%d", &num);
        printf("%d\n", num);
        fclose(fp);
    } else {
        printf("It can not open the file!");
    }
    return 0;
}