/*
 * Title: Demonstrate Use Constructor
 * Assignment No: 04 (A)
 *
 * Enrollment No: 2106206      Date: 17th Aug 2023
 * */
public class Practical4a {
    Practical4a() {
        System.out.println("Creating the Object | Constructor Called");
    }

    public static void main(String[] args) {
        // implicit call to constructor
        Practical4a objA = new Practical4a(); 
    }
}
