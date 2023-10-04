/*
 * Title: Type Conversion
 * Assignment No: 03
 *
 * Enrollment No: 2106206      Date: 10th Aug 2023
 * */

public class Practical3 {
    public static void main(String[] args) {
        int intA = 708;
        float floatA = intA;
        long longA = intA;
        // Error: Java: incompatible types: possible lossy conversion from int to short
        // short shortA = intA;
        
        System.out.println("Type Casting (Implicit): ");
        System.out.println("intA = " + intA);
        System.out.println("floatA = " + floatA);
        System.out.println("longA = " + longA);

        int intB = 2077;
        float floatB = (float) intB;
        short shortB = (short) floatB;
        char charB = (char) intB;

        System.out.println("Type Casting (Explicit): ");
        System.out.println("intB = " + intB);
        System.out.println("floatB = " + floatB);
        System.out.println("shortB = " + shortB);
        System.out.println("charB = " + charB);
    }
}
