/*
 * Title: Program Implementing Single Inheritance
 * Assignment No: 09 (a)
 *
 * Enrollment No: 2106206      Date: 7th Sept 2023
 * */

class Base {
    void display() {
        System.out.println("Display From Base Class");
    }
}

class Derived extends Base {
    void display() {
        super.display();
        System.out.println("Display from Derived Class");
    }
}

public class Practical9a {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}
