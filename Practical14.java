/*
 * Title: Develop a Program to draw following shapes, Graphics and Applets
 *        a. Cone
 *        b. Cylinders
 *        c. Cube
 *        d. Square inside a circle
 *        e. Circle inside a Square
 * Assignment No: 14
 *
 * Enrollment No: 2106206      Date: 19th Oct 2023
 * */
import java.awt.*;
import java.applet.*;

public class Practical14 extends Applet {
    public void paint(Graphics g) {
        // Cone
        g.fillOval(100, 200 , 50, 30);
        g.drawLine(125 , 150, 100, 215);
        g.drawLine(125 , 150, 150, 215);

        // Cylinder
        // g.drawOval(200, 200 , 50, 30);
        g.drawArc(200, 200, 50, 30, 180, 180);
        g.drawOval(200, 100 , 50, 30);
        g.drawLine(200, 215, 200,115 );
        g.drawLine(250, 215, 250,115 );

        // Cube
        g.drawRect(200,300, 40, 40);
        g.drawRect(220,320, 40, 40);
        g.drawLine(200, 300, 220, 320);
        g.drawLine(240, 340, 260, 360);
        g.drawLine(240, 300, 260, 320);
        g.drawLine(200, 340, 220, 360);


        // Square inside Circle
        g.drawOval(80, 280, 100, 100);
        g.drawRect(95, 295, 70 , 70);

        // Circle Inside Square
        g.drawRect(400, 100, 200, 200);
        g.drawOval(400, 100, 200, 200);
    }
}

/*
 * <applet code="Practical14.class" width=700 height=500></applet>
 */
