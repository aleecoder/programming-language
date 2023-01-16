#include <stdio.h>

//指针应用场景一
//函数返回多个值，某些值就只能通过指针返回
//传入的参数实际上是需要保存带回的结果的变量
//函数参数表中的数组实际上是指针
//sizeof(a) == sizeof(int*)
//但是可以利用数组的运算符[]进行运算
//数组变量是特殊的指针，数组变量本身表达地址
void min_max(int *a, int len, int *min, int *max);

//指针应用场景二
//函数返回运算的状态，结果通过指针返回
//常用的套路是让函数返回特殊的不属于有效范围内的值来表示出错，如-1
//但当任何数值都是有效的可能结果时，就得分开返回了
/**
 * 两个数做除法
 * @param a 被除数
 * @param b 除数
 * @param result 结果
 * @return 成功返回 1；否则返回 0
 */
int divide(int a, int b, int *result);
//用指针来做什么？
//-需要传入较大的数据时用作参数
//-传入数组后对数组做操作
//-函数返回不止一个结果，需要用函数来修改不止一个变量
//-动态申请的内存
int main() {
    int a[] = {1, 2, 3, 4, 5, 5, 6,};
    int min, max;
    min_max(a, sizeof(a) / sizeof(a[0]), &min, &max);
    printf("min=%d,max=%d\n", min, max);
    int x, y;
    printf("Enter x and y:");
    scanf("%d %d", &x, &y);
    int res;
    if (divide(x, y, &res)) {
        printf("%d/%d=%d\n", x, y, res);
    }
    //定义了指针变量，但没有指向任何变量会出现野指针
//    int *np;
    int *np = NULL;
    printf("np=%p", np);
    return 0;
}

void min_max(int *a, int len, int *min, int *max) {
    *min = *max = a[0];
    for (int i = 1; i < len; ++i) {
        if (a[i] < *min) {
            *min = a[i];
        }
        if (a[i] > *max) {
            *max = a[i];
        }
    }
}

int divide(int a, int b, int *result) {
    if (b == 0) {
        return 0;
    }
    *result = a / b;
    return 1;
}