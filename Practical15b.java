/*
 * Title: Develop a program for implementation of
 *        File Stream Classes
 * Assignment No: 15 (B)
 *
 * Enrollment No: 2106206      Date: 19th Oct 2023
 * */
import java.io.*;
public class Practical15b {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        FileOutputStream fout;

        try {
            // open input file
            try {
                fin = new FileInputStream(args[0]);
            } catch (FileNotFoundException e) {
                System.out.println("Input File Not Found");
                return;
            }

            try {
                fout = new FileOutputStream(args[1]);
            } catch (FileNotFoundException e) {
                System.out.println("Error Opening Output File");
                return;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: Practical15b FromFile ToFile");
            return;
        }

        // Copy File
        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                    fout.write(i);
                }
            } while (i != -1);

            System.out.println("\nNew File Created: " + args[1]);
            fin.close();
            fout.close();
        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}
