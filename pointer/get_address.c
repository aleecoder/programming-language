#include <stdio.h>

//&取地址，获得变量的地址，它的操作数必须是变量
//地址的大小是否与int相同取决于编译器
//printf("%p",&i);
int main() {
    int i = 0;
    printf("%x\n", &i);
    printf("%p\n", &i);
    printf("sizeof(int)=%llu\n", sizeof(int));
    printf("sizeof(&i)=%llu\n", sizeof(&i));
    //取数组的地址
    int arr[10];
    printf("%p\n", &arr);
    printf("%p\n", arr);
    printf("%p\n", &arr[0]);
    printf("%p\n", &arr[1]);
    return 0;
}