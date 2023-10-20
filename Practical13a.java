/*
 * Title: Develop a program on Basic Applet
 * Assignment No: 13 (A)
 *
 * Enrollment No: 2106206      Date: 19th Oct 2023
 * */
import java.applet.*;
import java.awt.*;

public class Practical13a extends Applet {
    public void paint(Graphics g) {
        g.setColor(new Color(0x008080));
        g.drawString("Hello Athena!", 20, 30);
    }
}

/*
<applet code="Practical13a.class" height=100 width=250></applet>
 */
