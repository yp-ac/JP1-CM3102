/*
 * Title: Program for MultiThreading Operation
 * Assignment No: 11
 *
 * Enrollment No: 2106206      Date: 12th Oct 2023
 * */

class PrinterThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("PrinterThread: running\t\tThreadId: " + this.getId());
    }
}

class PrinterRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("PrinterRunnable: running\tThreadId: " + Thread.currentThread().getId());
    }
}

public class Practical11 {
    public static void main(String[] args) {
        Thread t1 = new PrinterThread();
        Thread t2 = new Thread(new PrinterRunnable());

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
