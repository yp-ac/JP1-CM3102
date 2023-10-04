/*
 * Title: Program Implementing Wrapper Class
 * Assignment No: 07 (c)
 *
 * Enrollment No: 2106206      Date: 31st Aug 2023
 * */
public class Practical7c {
    public static void main(String[] args) {
        // calculate sum & avg of a given array (using Wrapper Class)
        Integer[] marks = new Integer[]{87, 99, 90, 92};
        Double sum = 0.0;
        Double avg = 0.0;

        for (Integer mark : marks) {
            sum += mark;
        }

        avg = sum / marks.length;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}
