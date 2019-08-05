package com.course;

/*
    Algorithm "Sum two grades and show the average"
        Declare  double grade01 = 0; grade02 = 0; result = 0;
        Read grade01;
        Read grade02;
        result = (grade01 + grade02) / 2;
        If result >= 70 then
            Print("Congratulation, average: " + result);
        else
            Print("Fail, average: " + result);
        End if
    End algorithm
 */

import java.util.Scanner;

public class SumGrades {

    private static void sumTwoGrades() {
        double grade01, grade02, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Algorithm \"Sum two grades and show the average\"****");
        System.out.print("Enter with first grade: ");
        grade01 = scanner.nextDouble();
        System.out.print("Enter with second grade: ");
        grade02 = scanner.nextDouble();
        result = (grade01 + grade02) / 2;
        if (result >= 70)
            System.out.println("Congratulation, average: " + result);
        else
            System.err.println("Fail, average: " + result);
    }

    public static void main(String[] args) {
        sumTwoGrades();
    }
}
