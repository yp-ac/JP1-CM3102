/*
 * Title: Program Implementing Vector class
 * Assignment No: 07 (a)
 *
 * Enrollment No: 2106206      Date: 31st Aug 2023
 * */

import java.util.Vector;

public class Practical7a {
    public static void main(String[] args) {
        // Store the n fibonacci numbers in vector
        int n = 7;
        Vector<Integer> fibo = new Vector<>();
        fibo.add(0);
        fibo.add(1);

        for (int i = 2; i <= n; i++) {
            fibo.add(fibo.get(i - 1) + fibo.get(i - 2));
        }

        System.out.println("Fibonacci Series: ");
        for (Integer e : fibo) {
            System.out.println(e);
        }
    }
}
