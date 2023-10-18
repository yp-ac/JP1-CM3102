/*
 * Title: Program for MultiThreading Operation
 * Assignment No: 11
 *
 * Enrollment No: 2106206      Date: 12th Oct 2023
 * */

class Counter {
    long count;

    public synchronized long increment() {
        return ++count;
    }
}

class PrinterThread extends Thread {
    final Counter counter;
    public PrinterThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("[" + counter.increment() + "] PrinterThread: running\t\tThreadId: " + this.getId());
    }
}

class PrinterRunnable implements Runnable {
    final Counter counter;
    public PrinterRunnable(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("[" + counter.increment() + "] PrinterRunnable: running\tThreadId: " + Thread.currentThread().getId());
    }
}

public class Practical11 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new PrinterThread(counter);
        Thread t2 = new Thread(new PrinterRunnable(counter));

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
