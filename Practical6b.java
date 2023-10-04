/*
 * Title: Program Implementing StringBuffer Class
 * Assignment No: 06 (b)
 *
 * Enrollment No: 2106206      Date: 31st Aug 2023
 * */

public class Practical6b {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Miss Simone");

        buffer.append("Weil");
        System.out.println("After append : " + buffer);

        buffer.insert(11, " ");
        System.out.println("After insert : " + buffer);

        buffer.delete(0, 5);
        System.out.println("After Delete : " + buffer);

        buffer.reverse();
        System.out.println("After Reverse: " + buffer);

        System.out.println("buf Capacity : " + buffer.capacity());
    }
}
