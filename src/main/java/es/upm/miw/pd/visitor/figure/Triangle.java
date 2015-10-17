package es.upm.miw.pd.visitor.figure;

public class Triangle extends Figure {

    private double base;

    private double height;

    public Triangle(String description, double base, double height) {
        super(description);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Triangle [description=" + description + ", base=" + base + ", height=" + height + "]";
    }

    @Override
    public double area(Visitor v) {
        return v.visitTriangle(this);
    }

    @Override
    public double numberOfSides(Visitor v) {
        return v.visitTriangle(this);
    }

}
