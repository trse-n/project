package org.donstu;

import java.awt.*;

public class Ellipse {
    private int x, y, a, b;

    public Ellipse(int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval(x - a, y - b, 2 * a, 2 * b);
    }

}
