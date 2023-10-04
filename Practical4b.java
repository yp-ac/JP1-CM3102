/*
 * Title: Demonstrate Use Multiple Constructor
 * Assignment No: 04 (B)
 *
 * Enrollment No: 2106206      Date: 17th Aug 2023
 * */

class Adder {
    int sum = 0; // initialize sum to 0
    Adder() {
        System.out.println("Default Constructor Called");
    }

    Adder(int rangeStop) {
        System.out.println("Constructor with one argument called");
        for ( int i = 1; i <= rangeStop; i++ )
            sum += i;
    }
    Adder(int ...args) {
        for (int element : args) {
            sum += element;
        }

        System.out.println("Constructor with Unlimited Arguments called");
    }

    void display(final String objName) {
        System.out.println(objName + " sum = " + sum);
    }
}

public class Practical4b {
    public static void main(String[] args) {
        Adder objA = new Adder();
        Adder objB = new Adder(3);
        Adder objC = new Adder(4, 5, 6);

        objA.display("objA");
        objB.display("objB");
        objC.display("objC");
    }
}
