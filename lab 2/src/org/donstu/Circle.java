package org.donstu;

import java.awt.*;
import java.util.Random;

public class Circle {

    private int x, y;
    private int radius;
    private int deltaX, deltaY;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.deltaX = getRandomDirection();
        this.deltaY = getRandomDirection();
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    public void updatePosition(int width, int height) {
        x += deltaX;
        y += deltaY;

        if (x - radius < 0 || x + radius > width) {
            deltaX = -deltaX;
        }
        if (y - radius < 0 || y + radius > height) {
            deltaY = -deltaY;
        }
    }


    private int getRandomDirection() {
        Random rand = new Random();
        return rand.nextInt(7) + 1;
    }
}

