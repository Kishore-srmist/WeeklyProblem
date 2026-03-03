/*
===========================================================
JAVA PROGRAMMING ELEMENTS LAB PRACTICE
Author      : KISHORE
Date        : 03-03-2026
Description : Level 1, Level 2 and Level 3 Programs
Concepts    : Comments, Variables, Data Types,
              Arithmetic Operators, Operator Precedence,
              Type Conversion, User Input
===========================================================
*/

import java.util.Scanner;

/* =========================================================
   LEVEL 1 - PROGRAM 1
   SIMPLE INTEREST CALCULATOR
========================================================= */
class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principalAmount;
        double rateOfInterest;
        double timePeriod;
        double simpleInterest;

        System.out.print("Enter Principal Amount: ");
        principalAmount = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rateOfInterest = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        timePeriod = input.nextDouble();

        simpleInterest = (principalAmount * rateOfInterest * timePeriod) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        input.close();
    }
}

/* =========================================================
   LEVEL 1 - PROGRAM 2
   AREA OF CIRCLE
========================================================= */
class AreaOfCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius;
        double pi = 3.14159;
        double area;

        System.out.print("Enter Radius: ");
        radius = input.nextDouble();

        area = pi * radius * radius;

        System.out.println("Area of Circle = " + area);

        input.close();
    }
}

/* =========================================================
   LEVEL 1 - PROGRAM 3
   SWAP TWO NUMBERS
========================================================= */
class SwapTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int temporaryVariable;

        System.out.print("Enter First Number: ");
        firstNumber = input.nextInt();

        System.out.print("Enter Second Number: ");
        secondNumber = input.nextInt();

        temporaryVariable = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporaryVariable;

        System.out.println("After Swapping:");
        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber);

        input.close();
    }
}

/* =========================================================
   LEVEL 1 - PROGRAM 4
   AVERAGE OF THREE NUMBERS
========================================================= */
class AverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1;
        double number2;
        double number3;
        double average;

        System.out.print("Enter First Number: ");
        number1 = input.nextDouble();

        System.out.print("Enter Second Number: ");
        number2 = input.nextDouble();

        System.out.print("Enter Third Number: ");
        number3 = input.nextDouble();

        average = (number1 + number2 + number3) / 3;

        System.out.println("Average = " + average);

        input.close();
    }
}

/* =========================================================
   LEVEL 2 - PROGRAM 1
   TEMPERATURE CONVERTER
========================================================= */
class TemperatureConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsiusTemperature;
        double fahrenheitTemperature;

        System.out.print("Enter Temperature in Celsius: ");
        celsiusTemperature = input.nextDouble();

        fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheitTemperature);

        input.close();
    }
}

/* =========================================================
   LEVEL 2 - PROGRAM 2
   SALARY CALCULATOR
========================================================= */
class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double basicSalary;
        double hra;
        double da;
        double totalSalary;

        System.out.print("Enter Basic Salary: ");
        basicSalary = input.nextDouble();

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;

        totalSalary = basicSalary + hra + da;

        System.out.println("Total Salary = " + totalSalary);

        input.close();
    }
}

/* =========================================================
   LEVEL 3 - PROGRAM 1
   OPERATOR PRECEDENCE DEMONSTRATION
========================================================= */
class OperatorPrecedenceDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int result;

        System.out.print("Enter First Number: ");
        number1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        number2 = input.nextInt();

        System.out.print("Enter Third Number: ");
        number3 = input.nextInt();

        result = number1 + number2 * number3;
        System.out.println("Result (without brackets) = " + result);

        result = (number1 + number2) * number3;
        System.out.println("Result (with brackets) = " + result);

        input.close();
    }
}