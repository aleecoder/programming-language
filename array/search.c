#include <stdio.h>

//数组作为函数参数时，往往必须再用另一个参数来传入数组的大小
//TODO:数组作为函数的参数时，不能在[]中给出数组的大小，不能再利用sizeof来计算数组的元素个数
int search(int key, int a[], int length);

void print(int a[], int length);

int main() {
//    int t[10] = {}; //默认全赋值为0
//    int sparse_array[500] = {[1]=10, [5]=9, [6]=4};   //C99 适用于稀疏数组
    int a[] = {2, 4, 5, 7, 1, 3, 5, 9, 11, 12, 23, 14, 32};
//    int b[] = a;    //数组变量本身不能被赋值
    int x;
    printf("Please enter a number:");
    scanf("%d", &x);
    int loc = search(x, a, sizeof(a) / sizeof(a[0]));
    if (loc != -1) {
        printf("%d in the %dth position.", x, loc);
    } else {
        printf("%d does not exist!", x);
    }
    return 0;
}

int search(int key, int a[], int length) {
    int ret = -1;
    for (int i = 0; i < length; ++i) {
        if (a[i] == key) {
            ret = i;
            break;
        }
    }
    return ret;
}

void print(int a[], int length) {
    for (int i = 0; i < length; ++i) {
        printf("%d ", a[i]);
    }
    printf("\n");
}