/*
 * Title: Develop a program to Accept input using command line arguments
 * Assignment No: 05 (A)
 *
 * Enrollment No: 2106206      Date: 17th Aug 2023
 * */

public class Practical5a {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Provide n as Command line argument");
            System.exit(-1);
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            System.out.printf("[%2d]", i);
        }
    }
}
