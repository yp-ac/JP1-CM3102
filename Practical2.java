/*
* Title: Demonstrate Use of Different control and looping structures
* Assignment No: 02
*
* Enrollment No: 2106206      Date: 10th Aug 2023
* */

public class Practical2 {
    // Check if the given age is legal to drive
    static void ifStatementExample() {
        int age = 18;

        System.out.println("age = " + age);

        if (age >= 18)
            System.out.println("You can drive");
    }

    // Find the min of given numbers
    static void ifElseStatementExample() {
        int a = 7, b = 8;

        System.out.println("a = " + a + " b = " + b);

        if (a < b)
            System.out.println(a + " is minimum");
        else
            System.out.println(b + " is minimum");
    }

    // check if number is positive, negative, or zero
    static void ifElseIfLadderExample() {
        int num = 0;

        System.out.println("num = " + num);

        if (num < 0)
            System.out.println("num is negative");
        else if (num > 0)
            System.out.println("num is positive");
        else
            System.out.println("num is zero");
    }

    // check if the number is positive/negative/zero, and if positive, greater or less than 100
    static void nestedIfExample() {
        int num = 200;

        if (num > 0) {
            System.out.println("Number is Positive");

            if (num > 100)
                System.out.println("Number is Greater than 100");
            else
                System.out.println("Number is Less than 100");
        } else if (num < 0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number is Zero");
    }

    // convert int to day of week
    static void switchCaseExample() {
        int dow = 1;

        switch (dow) { // switch for day of week
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid DOW");
        }
    }

    // print 1-10 using for loop
    static void forLoopExample() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i + "\t");
    }

    // find the factorial of a given number
    static int factorial(int n) {
        int fact = 1, i = 1; // 0! = 1

        while (i <= n) {
            fact *= i;
            i++;
        }

        return fact;
    }
    static void whileLoopExample() {
        int fact = factorial(7);

        System.out.println("7! = " + fact);
    }

    // print factorial while the factorial is less than 1000
    static void doWhileLoopExample() {
        int i = 0;
        int fact;

        do {
            fact = factorial(i);
            System.out.println(i + "! = " + fact);
            i++;
        } while (fact < 1000);
    }

    public static void main(String[] args) {
        // conditionals
        ifStatementExample();
        ifElseStatementExample();
        ifElseIfLadderExample();
        nestedIfExample();
        switchCaseExample();

        // loops
        forLoopExample();
        whileLoopExample();
        doWhileLoopExample();
    }
}
