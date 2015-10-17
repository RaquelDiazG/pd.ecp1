package es.upm.miw.pd.visitor.figure;

import upm.jbb.IO;

public final class Main {

    private FiguresManager figuresManager;

    public Main() {
        figuresManager = new FiguresManager();
    }

    public void addTriangle() {
        String description = IO.getIO().readString("Description");
        double base = IO.getIO().readDouble("Base");
        double height = IO.getIO().readDouble("Height");
        Triangle triangle = new Triangle(description, base, height);
        IO.getIO().println(triangle);
        figuresManager.add(triangle);
    }

    public void addSquare() {
        String description = IO.getIO().readString("Description");
        double side = IO.getIO().readDouble("Side");
        Square square = new Square(description, side);
        IO.getIO().println(square);
        figuresManager.add(square);
    }

    public void addCircle() {
        String description = IO.getIO().readString("Description");
        double radius = IO.getIO().readDouble("Radius");
        Circle circle = new Circle(description, radius);
        IO.getIO().println(circle);
        figuresManager.add(circle);
    }

    public void area() {
        IO.getIO().println(figuresManager.totalArea());
    }

    public void numberOfSides() {
        IO.getIO().println(figuresManager.totalNumberOfSides());
    }

    public static void main(String[] args) {
        IO.getIO().addView(new Main());
    }
}
