#include <stdio.h>

//指针运算
//指针的类型
//无论指向什么类型，所有的指针的大小都是一样的，因为都是地址
//但是指向不同类型的指针是不嫩直接互相赋值的，这是为了避免用错指针
int main() {
    char ac[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
    char *p = ac;
    int size = sizeof(ac) / sizeof(ac[0]);
    //使用指针遍历数组
    while (*p != ac[size - 1]) {
        printf("%d ", *p++);
    }
    printf("p =%p\n", p);
    printf("p+1=%p\n", p + 1);
    //sizeof(char) = 1
    //sizeof(int) = 4
    int ai[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
    int *q = ai;
    printf("q =%p\n", q);
    printf("q+1=%p\n", q + 1);
    return 0;
}
