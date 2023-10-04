/*
 * Title: Program Implementing String Class
 * Assignment No: 06 (a)
 *
 * Enrollment No: 2106206      Date: 31st Aug 2023
 * */

public class Practical6a {
    public static void main(String[] args) {
        String str = "Anything that can go wrong will go wrong";

        System.out.println("String Length : " + str.length());
        System.out.println("String Concat : " + str.concat(" -Murphy's Law"));
        System.out.println("String Compare: " + str.equals(str.toLowerCase()));
        System.out.println("Substring     : " + str.substring(14, 26));
        System.out.println("String Search : " + str.indexOf("wrong"));
        System.out.println("String Search : [LastIdx] " + str.lastIndexOf("wrong"));
    }
}
