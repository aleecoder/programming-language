#include <stdio.h>

int f();
//尽量避免使用全局变量
//使用全局变量和静态本地变量的函数是线程不安全的
int gall;

int main() {
    f();
    printf("\n");
    f();
    return 0;
}

int f() {
    //静态本地变量其实就是全局变量，全局生存期、本地作用域
    static int all = 1;
    int k = 0;
    printf("&gall=%p\n", &gall);
    printf("&all=%p\n", &all);
    printf("&k=%p\n", &k);
    printf("in %s all=%d\n", __func__, all);
    all++;
    printf("again in %s all=%d\n", __func__, all);
    return all;
}