package com.repeat.coding;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DaysToYearsMonthsDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("일 수를 입력하세요: ");
        int days = scanner.nextInt();

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(days);

        Period period = Period.between(startDate, endDate);

        int years = period.getYears();
        int months = period.getMonths();
        int remainingDays = period.getDays();

        System.out.printf("%d년 %d월 %d일\n", years, months, remainingDays);
    }
}