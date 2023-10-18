/*
 * Title: Using Exception Handling
 * Assignment No: 12
 *
 * Enrollment No: 2106206      Date: 12th Oct 2023
 * */

class AthenaException extends Exception {
    AthenaException() {
        super("This is a custom exception AthenaException");
    }
}

public class Practical12 {
    public static void athenaException() throws AthenaException {
        throw new AthenaException();
    }

    public static void main(String[] args) {
        try {
            int n = 7 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            athenaException();
        } catch (AthenaException e) {
            e.printStackTrace();
        }
    }
}
