#include <stdio.h>
#include <stdlib.h>

//如果输入数据时，先告诉你个数，然后再输入，要记录每个数据
//C99可以用变量做数组定义的大小，C99之前呢？
//- 动态内存分配！！！
//void *malloc(size_t size);
//向malloc申请的空间的大小是以字节为单位的
//返回的结果是void*，需要类型转换为自己需要的类型
// -比如 (int*)malloc(n*sizeof(int))
//注意：
// -使用前要#include <stdlib.h>
// -使用后要调用free(void *_Memory)释放申请的内存空间
int main() {
    int n;
    int *a;
    int i;
    printf("Enter the length of a:");
    scanf("%d", &n);
    a = (int *) malloc(n * sizeof(int));
    for (i = 0; i < n; ++i) {
        scanf("%d", &a[i]);
    }
    //遍历数组
    for (i = 0; i < n; ++i) {
        printf("%d ",a[i]);
    }
    free(a);
    return 0;
}
