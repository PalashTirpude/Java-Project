package com.java.project.date;

import java.time.LocalDate;

public class LocalDateMethodsDemo {

    public static void main(String[] args) {
        System.out.printf("Current Date : %s%n",LocalDate.now());
        System.out.printf("Yesterday Date : %s%n",LocalDate.now().minusDays(1));
        System.out.printf("Tomorrow Date : %s%n",LocalDate.now().plusDays(1));
        System.out.printf("Next Month Date : %s%n",LocalDate.now().plusMonths(1));
        System.out.printf("Next Year Date : %s%n",LocalDate.now().plusYears(1));
        System.out.printf("Previous Month Date : %s%n",LocalDate.now().minusMonths(1));
        System.out.printf("Previous Year Date : %s%n",LocalDate.now().minusYears(1));
        System.out.printf("Specific Date : %s%n",LocalDate.of(2022,11,23));
        System.out.printf("Parse Date from String : %s%n",LocalDate.parse("2024-09-23"));
        System.out.printf("Fetched Day : %s, Month : %s, Year : %s from given Date %s%n"
                ,LocalDate.now().getDayOfMonth()
                ,LocalDate.now().getMonth()
                ,LocalDate.now().getYear()
                ,LocalDate.now()
                );
        System.out.printf("Get Day of Week : %s%n",LocalDate.now().getDayOfWeek());
        System.out.printf("Get Day of year : %s%n",LocalDate.now().getDayOfYear());
        LocalDate currentDate=LocalDate.now();
        LocalDate date=LocalDate.of(2023,8,15);
        System.out.printf("Is Current Date before Given Date : %s ?%n%s%n",date,currentDate.isBefore(date));
        System.out.printf("Is Current Date After Given Date : %s ?%n%s%n",date,currentDate.isAfter(date));
        System.out.printf("Check Given Date : %s is Leap Year ?%n%s%n",date,date.isLeapYear());
    }
}
