package org.dstu.domain;

public abstract class Form implements IellipseForm{
    private String figureName;

    public Form() {
    }

    public Form(String figureName) {
        this.figureName = figureName;
    }

    public Form(String[] line) {
        figureName = line[0];
    }

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ");
        builder.append(figureName);
        return builder.toString();
    }
}
