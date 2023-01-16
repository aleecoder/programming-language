#include <stdio.h>
#include <stdlib.h>

//系统可以malloc给我多大的内存呢？
int main() {
    void *p = NULL;
    printf("before malloc p=%p\n", p);
    int cnt = 0;
    while ((p = malloc(100 * 1024 * 1024))) {
        cnt++;
    }
    printf("after malloc p=%p\n", p);
    //实测结果 The system assigns me 22800MB of memory!
    //这应该是逻辑上的，然后系统并没有给分配
    printf("The system assigns me %d00MB of memory!", cnt);
    free(p);
    return 0;
}
