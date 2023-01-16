#include <stdio.h>
#include <stdbool.h>

typedef struct date {
    int month;
    int day;
    int year;
} Date;
typedef struct time {
    int hour;
    int minutes;
    int seconds;
} Time;

//结构作为函数参数
//函数内新建一个结构变量，并复制调用者的结构的值
int numberOfDays(Date *d);

bool isLeap(Date *d);

Date *getTomorrow(Date *today);

Time timeUpdate(Time now);

int main() {
    Date today = {01, 14, 2023};
    printf("Today's date is %i-%i-%i.\n",
           today.year, today.month, today.day);
    //结构指针
    //和数组不同，结构变量的名字并非结构变量的地址，必须使用&运算符
    struct date *p = &today;
    printf("Address of today is %p\n", p);
    //结构与函数
    printf("Enter today's date (yyyy-mm-dd): ");
    scanf("%i-%i-%i", &today.year, &today.month, &today.day);
    Date *tomorrow = getTomorrow(&today);
    printf("Tomorrow's date is %i-%i-%i.\n",
           tomorrow->year, tomorrow->month, tomorrow->day);
    //结构数组
    Time times[] = {{4, 5, 59},
                    {2, 4, 20},
                    {8, 8, 21}};
    int size = sizeof(times) / sizeof(times[0]);
    for (int i = 0; i < size; ++i) {
        printf("Time is %.2i:%.2i:%.2i\n",
               times[i].hour, times[i].minutes, times[i].seconds);
        times[i] = timeUpdate(times[i]);
        printf("...one second later it's %.2i:%.2i:%.2i\n",
               times[i].hour, times[i].minutes, times[i].seconds);
    }
    return 0;
}

Time timeUpdate(Time now) {
    ++now.seconds;
    if (now.seconds == 60) {
        now.seconds = 0;
        ++now.minutes;
        if (now.minutes == 60) {
            now.minutes = 0;
            ++now.hour;
            if (now.hour == 24) {
                now.hour = 0;
            }
        }
    }
    return now;
}

int numberOfDays(Date *d) {
    int days;
    const int daysPerMonth[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (d->month == 2 && isLeap(d)) {
        days = 29;
    } else {
        days = daysPerMonth[d->month - 1];
    }
    return days;
}

bool isLeap(Date *d) {
    bool leap = false;
    if ((d->year % 4 == 0 && d->year % 100 != 0) || d->year % 400 == 0) {
        leap = true;
    }
    return leap;
}

Date *getTomorrow(Date *today) {
    Date *tomorrow = today;
    if (today->day != numberOfDays(today)) {
        tomorrow->year = today->year;
        tomorrow->month = today->month;
        tomorrow->day = today->day + 1;
    } else if (today->month == 12) {
        tomorrow->day = 1;
        tomorrow->month = 1;
        tomorrow->year = today->year + 1;
    } else {
        tomorrow->day = 1;
        tomorrow->month = today->month + 1;
        tomorrow->year = today->year;
    }
    return tomorrow;
}