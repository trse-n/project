package org.dstu.domain;

public class ellipse extends Form {
    private int coordinatesx;
    private int coordinatesy;
    private int lengtha;
    private int lengthb;

    public ellipse() {
    }

    public ellipse(String[] line) {
        super(line[0]);
        coordinatesx = Integer.parseInt(line[1]);
        coordinatesy = Integer.parseInt(line[2]);
        lengtha = Integer.parseInt(line[3]);
        lengthb = Integer.parseInt(line[4]);
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

    public int getLengtha() {
        return lengtha;
    }

    public void setLengtha(int lengtha) {
        this.lengtha = lengtha;
    }

    public int getLengthb() {
        return lengthb;
    }

    public void setLengthb(int lengthb) {
        this.lengthb = lengthb;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Эллипс: ");
        builder.append(super.toString());
        builder.append(" | Координаты: ");
        builder.append("(" + coordinatesx + ";" + coordinatesy + ")");
        builder.append(" | Длина большой полуоси: ");
        builder.append(lengtha);
        builder.append(" | Длина малой полуоси: ");
        builder.append(lengthb);
        return builder.toString();
    }
}
