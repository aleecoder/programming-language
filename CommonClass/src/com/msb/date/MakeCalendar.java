package com.msb.date;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/4  13:21
 * @Description: 制作日历
 * @version: 1.0
 */
public class MakeCalendar {
    private static final String[] weeks = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    private static int count = 0;

    private static void printTableHead(){
        System.out.println("---------------------------");
        for (String value : weeks)
            System.out.print(value + "\t");
        System.out.println();
    }

    private static void printEmpty(int week_of_day){
        for (int i = 1; i < week_of_day; i++) {
            System.out.print("\t");
            count++;
        }
    }
    private static void printOthersLine(Calendar cal) {
        int currentDay = cal.get(Calendar.DATE);
        int maxDate = cal.getActualMaximum(Calendar.DATE);
        cal.set(Calendar.DATE,1);
        int week_of_day = cal.get(Calendar.DAY_OF_WEEK);    // 1号是周几
        printEmpty(week_of_day);    // 输出空格
        for (int i = 1; i <= maxDate; i++) {
            if (i == currentDay)
                System.out.print(i + "*\t");
            else
                System.out.print(i + "\t");
            count++;
            if (count % 7 == 0)
                System.out.println();
        }
    }
    public static void printCalendar(){
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date return the Month (such as 2020-1-3): ");
        String s = sc.nextLine();
        try {
            Date date = Date.valueOf(s);
            cal.setTime(date);
        }catch (Exception e){
            System.out.println("Incorrect format!");
        }
        printTableHead();
        printOthersLine(cal);
    }
}