#include <stdio.h>

//C语言需要类型，但对类型的安全检查并不足够
//C语言的类型
//  整数: char、short、int、long、long long
//  浮点数: float、double、long double
//  逻辑: bool
//  指针
//  自定义类型
//sizeof 是一个运算符，给出某个类型或变量在内存中所占据的字节数
int main() {
    printf("sizeof(char)=%llu byte\n", sizeof(char));
    printf("sizeof(short)=%llu\n", sizeof(short));
    //int取决于编译器（CPU），通常的意义是"一个字"
    printf("sizeof(int)=%llu\n", sizeof(int));
    //long取决于编译器（CPU），通常的意义是"一个字"
    printf("sizeof(long)=%llu\n", sizeof(long));
    printf("sizeof(long long)=%llu\n", sizeof(long long));
    //unsigned的初衷并非扩展数能表达的范围，而是为了移位，做纯二进制运算
    //如果一个字面量常数想要表达自己是unsigned，可以在后面加u或U
    char c = 255;
    unsigned char ch = 255;
    int i = 255;
    printf("c=%d ch = %d i=%d", c, ch, i);
    return 0;
}