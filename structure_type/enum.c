#include <stdio.h>

enum COLOR {
    //常量符号，类型是int，值依次从0到n
    RED, YELLOW, GREEN, NumCOLORS
};

void getColor(enum COLOR c) {
    switch (c) {
        case RED:
            printf("%s\n", "red");
            break;
        case YELLOW:
            printf("%s\n", "yellow");
            break;
        case GREEN:
            printf("%s\n", "green");
            break;
        default:
            printf("%s\n", "unknown");
    }
}

int main() {
    enum COLOR t;
    scanf("%d", &t);
    getColor(t);
    int color = -1;
    char *ColorNames[NumCOLORS] = {"red", "yellow", "green"};
    char *colorName = NULL;
    printf("Please enter your favorite color code: ");
    scanf("%d", &color);
    if (color >= 0 && color < NumCOLORS) {
        colorName = ColorNames[color];
    } else {
        colorName = "unknown";
    }
    printf("Your favorite color is %s\n", colorName);
    return 0;
}