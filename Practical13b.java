/*
 * Title: Develop a program using Control loops using applets
 * Assignment No: 13 (B)
 *
 * Enrollment No: 2106206      Date: 19th Oct 2023
 * */

import java.applet.*;
import java.awt.*;

public class Practical13b extends Applet {
    int n;
    String type = "Rectangle";

    @Override
    public void init() {
        setLayout(null);

        Choice type = new Choice();
        type.add("Rectangle");
        type.add("Square");
        type.add("Oval");
        type.add("Circle");
        type.setBounds(20, 20, 80, 25);
        add(type);

        TextField nInput = new TextField("10");
        nInput.setBounds(110, 20, 30, 25);
        add(nInput);

        Button drawButton = new Button("Draw");
        drawButton.setBounds(180, 20, 55, 25);
        drawButton.addActionListener(e -> {
            try {
                n = Integer.parseInt(nInput.getText());
            } catch (NumberFormatException ne) {
                showStatus("Invalid N");
            }

            if (!(1 <= n && n <= 10)) {
                n = 10;
                showStatus("n does not satisfy 1 <= n <= 10");
            }

            this.type = type.getSelectedItem();
            repaint();
            showStatus("Draw Button Clicked");
        });
        add(drawButton);
    }

    @Override
    public void paint(Graphics g) {
        int x = 70;
        int y = 110;
        int width = 100;
        int height = 50;

        if (this.type.equals("Square") || this.type.equals("Circle"))
            height = width;

        g.setColor(new Color(0x008080));
        for (int i = 0; i < n; i++) {
            if (this.type.equals("Square") || this.type.equals("Rectangle"))
                g.drawRect(x, y, width, height);
            else
                g.drawOval(x, y, width, height);

            x -= 5;
            y -= 5;
            width += 10;
            height += 10;
        }
    }
}

/*
<applet code="Practical13b.class" height=270 width=240></applet>
*/
