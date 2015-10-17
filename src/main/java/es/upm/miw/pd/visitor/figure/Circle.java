package es.upm.miw.pd.visitor.figure;

public class Circle extends Figure {

    private double radius;

    public Circle(String description, double radius) {
        super(description);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle [description=" + description + ", radius=" + radius + "]";
    }

    @Override
    public double area(Visitor v) {
        return v.visitCircle(this);
    }

    @Override
    public double numberOfSides(Visitor v) {
        return v.visitCircle(this);
    }

}
