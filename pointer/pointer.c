#include <stdio.h>

//指针，就是保存地址的变量
//普通变量的值是实际的值
//指针变量的值是具有『实际值的变量』的地址
//作为参数的指针，在被调用时得到了某个变量的地址
void func(int *p) {
    printf("func::p=%p\n", p);
    //在函数里可以通过这个指针访问外面的i
    //*是一个单目运算符，用来访问指针的值所表示的地址上的变量
    //读取指针所指向变量的值
    int i = *p;
    printf("func::*p=%d\n", *p);
    printf("func::i=%d\n", i);
    //修改指针所指向变量的值
    *p = 2;
}

int main() {
    int i = 0;
    int *p = &i;
    printf("p=%p\n", p);
    func(p);
    printf("i=%d", i);
    return 0;
}
