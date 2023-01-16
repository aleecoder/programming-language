#include <stdio.h>

struct point {
    int x;
    int y;
};
typedef struct rectangle {
    struct point p1;
    struct point p2;
} Rectangle;

void printRect(Rectangle r) {
    printf("<%d,%d> to <%d,%d>\n", r.p1.x, r.p1.y, r.p2.x, r.p2.y);
}

int main() {
    Rectangle rects[] = {{{1, 2}, {3, 4}},
                         {{5, 6}, {7, 8}}};
    int size = sizeof(rects) / sizeof(rects[0]);
    for (int i = 0; i < size; ++i) {
        printRect(rects[i]);
    }
    return 0;
}