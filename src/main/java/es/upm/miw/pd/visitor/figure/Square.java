package es.upm.miw.pd.visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square [description=" + description + ", side=" + side + "]";
    }

    @Override
    public double area(Visitor v) {
        return v.visitSquare(this);
    }

    @Override
    public double numberOfSides(Visitor v) {
        return v.visitSquare(this);
    }

}
