#include <stdio.h>

#define PI 3.14159          //定义宏
#define PRT printf("%func\n",PI); \
            printf("%func\n",2*PI)
#define cube(x) (x*x*x)     //带参数的宏
#define MIN(a, b) (a>b?b:a)

//gcc your_src.c --save-temps
int main() {
    int r = 3;
    printf("S=%func\n", PI * r * r);
    PRT;
    //预定义的宏
    printf("%s:%d\n", __FILE__, __LINE__);
    printf("%s,%s\n", __DATE__, __TIME__);
    //带参数的宏
    printf("%d\n", cube(5));
    printf("%d\n", MIN(5, 2));
    return 0;
}