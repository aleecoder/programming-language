#include <stdio.h>
#include "student.h"

void getList(Student s[], int number);

int save(Student s[], int number);

int main() {
    int number = 0;
    printf("Please enter the number of students: ");
    scanf("%d", &number);
    Student s[number];
    getList(s, number);
    if (save(s, number)) {
        printf("File saved successfully!");
    } else {
        printf("File save failed!");
    }
    return 0;
}

void getList(Student s[], int number) {
    char format[STR_LEN];
    sprintf(format, "%%%ds", STR_LEN - 1);
    for (int i = 0; i < number; ++i) {
        printf("The %dth student:\n", i);
        printf("\tname:");
        scanf(format, s[i].name);
        printf("\tgender(0->man,1->woman,2->others):");
        scanf("%d", &s[i].gender);
        printf("\tage:");
        scanf("%d", &s[i].age);
    }
}

int save(Student s[], int number) {
    int ret = -1;
    FILE *fp = fopen("student.data", "w");
    if (fp) {
        ret = fwrite(s, sizeof(Student), number, fp);
        fclose(fp);
    }
    return ret == number;
}

