/*
===========================================================
JAVA CONTROL FLOW LAB PRACTICE
Author      : Your Name
Date        : 03-03-2026
Description : Level 1, Level 2 and Level 3 Programs
Concepts    : Control Flow, Boolean, Logical Operators,
              if-else, switch, for loop, while loop,
              break, continue
===========================================================
*/

import java.util.Scanner;

/* =========================================================
   LEVEL 1 - PROGRAM 1
   CHECK WHETHER NUMBER IS POSITIVE, NEGATIVE OR ZERO
========================================================= */
class NumberCheck {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number;
        boolean isPositive;
        boolean isNegative;

        // Taking user input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Boolean expressions
        isPositive = number > 0;
        isNegative = number < 0;

        // Conditional statements
        if (isPositive) {
            System.out.println("Number is Positive");
        } else if (isNegative) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }

        input.close();
    }
}

/* =========================================================
   LEVEL 1 - PROGRAM 2
   CHECK ELIGIBILITY TO VOTE
========================================================= */
class VotingEligibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;
        boolean isEligible;

        System.out.print("Enter your age: ");
        age = input.nextInt();

        isEligible = age >= 18;

        if (isEligible) {
            System.out.println("You are Eligible to Vote.");
        } else {
            System.out.println("You are Not Eligible to Vote.");
        }

        input.close();
    }
}

/* =========================================================
   LEVEL 1 - PROGRAM 3
   MULTIPLICATION TABLE USING FOR LOOP
========================================================= */
class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int counter;
        int result;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // For loop
        for (counter = 1; counter <= 10; counter++) {

            result = number * counter;
            System.out.println(number + " x " + counter + " = " + result);
        }

        input.close();
    }
}

/* =========================================================
   LEVEL 1 - PROGRAM 4
   SUM OF NUMBERS USING WHILE LOOP
========================================================= */
class SumUsingWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limit;
        int counter = 1;
        int sum = 0;

        System.out.print("Enter limit: ");
        limit = input.nextInt();

        // While loop
        while (counter <= limit) {
            sum = sum + counter;
            counter++;
        }

        System.out.println("Sum = " + sum);

        input.close();
    }
}

/* =========================================================
   LEVEL 2 - PROGRAM 1
   GRADE CALCULATOR USING IF-ELSE IF
========================================================= */
class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int marks;
        String grade;

        System.out.print("Enter Marks: ");
        marks = input.nextInt();

        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade = " + grade);

        input.close();
    }
}

/* =========================================================
   LEVEL 2 - PROGRAM 2
   SIMPLE CALCULATOR USING SWITCH
========================================================= */
class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1;
        double number2;
        double result;
        int choice;

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        System.out.print("Enter First Number: ");
        number1 = input.nextDouble();

        System.out.print("Enter Second Number: ");
        number2 = input.nextDouble();

        switch (choice) {

            case 1:
                result = number1 + number2;
                System.out.println("Result = " + result);
                break;

            case 2:
                result = number1 - number2;
                System.out.println("Result = " + result);
                break;

            case 3:
                result = number1 * number2;
                System.out.println("Result = " + result);
                break;

            case 4:
                result = number1 / number2;
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        input.close();
    }
}

/* =========================================================
   LEVEL 3 - PROGRAM 1
   PRIME NUMBER CHECK WITH BREAK AND CONTINUE
========================================================= */
class PrimeNumberCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int counter;
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number <= 1) {
            isPrime = false;
        } else {

            for (counter = 2; counter < number; counter++) {

                if (number % counter == 0) {
                    isPrime = false;
                    break;   // break statement
                } else {
                    continue; // continue statement
                }
            }
        }

        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }

        input.close();
    }
} 