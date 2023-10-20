/*
 * Title: Develop a program for implementation of
 *        I/O Classes
 * Assignment No: 15 (A)
 *
 * Enrollment No: 2106206      Date: 19th Oct 2023
 * */
import java.io.*;

public class Practical15a {
    public static void main(String[] args) {
        byte[] content = "I love Java".getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(content);
        System.out.println("Content of the byte array input stream is: ");
        while(bais.available() > 0)
            System.out.print("[" + (char) bais.read() + "]");

        System.out.println("\nContent of the byte array output stream is: ");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(65);
        baos.write(116);
        baos.write(104);
        baos.write(101);
        baos.write(110);
        baos.write(97);

        for(byte x : baos.toByteArray())
            System.out.print("[" + (char) x + "]");
    }
}