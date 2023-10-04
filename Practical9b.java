/*
 * Title: Program Implementing Multiple Inheritance
 * Assignment No: 09 (b)
 *
 * Enrollment No: 2106206      Date: 7th Sept 2023
 * */

interface IBaseFirst {
    void ibasefirst_display();
}

interface IBaseSecond {
    void ibasesecond_display();
}

class Derived implements IBaseFirst, IBaseSecond {
    @Override
    public void ibasefirst_display() {
        System.out.println("[IBaseFirst] display implementation");
    }

    @Override
    public void ibasesecond_display() {
        System.out.println("[IBaseSecond] display implementation");
    }

    public void display() {
        System.out.println("[Derived] display implementation");
    }
}

public class Practical9b {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
        d.ibasefirst_display();
        d.ibasesecond_display();
    }
}
