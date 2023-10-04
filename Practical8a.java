/*
 * Title: Program Implementing Overloading
 * Assignment No: 08 (a)
 *
 * Enrollment No: 2106206      Date: 7th Sept 2023
 * */

class Greetings {
    static void greet() {
        System.out.println("Greetings, User!");
    }

    static void greet(String name) {
        System.out.println("Greetings, " + name + "!");
    }
}

public class Practical8a {
    public static void main(String[] args) {
        Greetings.greet();
        Greetings.greet("Charles");
    }
}
