#include <stdio.h>

//如果要构造一个字符串，用数组
//如果要处理一个字符串，用指针
//字符串可以表示为char* 的形式
//char* 不一定是字符串，可能指向的是字符的数组
//只有char* 所指的字符数组有结尾的0，才能说它所指的是字符串
int main() {
    char *str = "Hello";      //字符串常量
    char *str2 = "Hello";    //"Hello\0"位于代码段，并且是只读的
    //str[0] = 'B';         //Segmentation fault
    printf("s =%p\n", str);      //00007ff707c1a000
    printf("s2=%p\n", str2);    //00007ff707c1a000
    printf("Here!str[0]=%c\n", str[0]);

    char s[] = "Hello";      //字符串变量
    char s2[] = "Hello";
    printf("s[] =%p\n", s);      //0000008cc8fffc9a
    printf("s2[]=%p\n", s2);      //0000008cc8fffc94
    s[0] = 'B';
    printf("Here!s[0]=%c\n", s[0]);
    return 0;
}