package org.donstu;

import java.awt.*;

public class MovingCircle {
    private int centerX, centerY;
    private int radius;
    private double angle;
    private Color color;

    public MovingCircle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.angle = 0.0;
        this.color = Color.BLUE;
    }

    public void updatePosition(int ellipseRadiusX, int ellipseRadiusY) {
        angle += 0.05;
        if (angle > 2 * Math.PI) {
            angle -= 2 * Math.PI;
        }

        if ((centerX + ellipseRadiusX * Math.cos(angle)) >= (centerX + ellipseRadiusX - radius)) {
            color = new Color((int) (Math.random() * 0x1000000));
            radius = (int) (Math.random() * 20 + 10);
        }
    }

    public void draw(Graphics g) {
        int circleX = (int) (centerX + (radius * Math.cos(angle)));
        int circleY = (int) (centerY + (radius * Math.sin(angle)));
        g.setColor(color);
        g.fillOval(circleX - radius, circleY - radius, 2 * radius, 2 * radius);
    }

}
