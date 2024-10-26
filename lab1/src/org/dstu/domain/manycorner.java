package org.dstu.domain;

public class manycorner extends Form {
    private int coordinatesx;
    private int coordinatesy;
    private int sides;
    private int length;

    public manycorner() {
    }

    public manycorner(String[] line) {
        super(line[0]);
        coordinatesx = Integer.parseInt(line[1]);
        coordinatesy = Integer.parseInt(line[2]);
        sides = Integer.parseInt(line[3]);
        length = Integer.parseInt(line[4]);
    }


    public int getCoordinatesx() {
        return coordinatesx;
    }

    public void setCoordinatesx(int coordinatesx) {
        this.coordinatesx = coordinatesx;
    }

    public int getCoordinatesy() {
        return coordinatesy;
    }

    public void setCoordinatesy(int coordinatesy) {
        this.coordinatesy = coordinatesy;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Многоугольник: ");
        builder.append(super.toString());
        builder.append(" | Координаты: ");
        builder.append("(" + coordinatesx + ";" + coordinatesy + ")");
        builder.append(" | Количество сторон: ");
        builder.append(sides);
        builder.append(" | Длина сторон: ");
        builder.append(length);
        return builder.toString();
    }
}
