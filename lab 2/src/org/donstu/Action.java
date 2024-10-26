package org.donstu;

import java.awt.*;

public class Action {
    private int x, y;
    private final int size = 30;

    public Action(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x - size / 2, y - size / 2, size, size);
    }

    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
