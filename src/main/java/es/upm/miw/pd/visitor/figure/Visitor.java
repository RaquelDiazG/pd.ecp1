package es.upm.miw.pd.visitor.figure;

public abstract class Visitor {

    public abstract double visitTriangle(Triangle triangle);

    public abstract double visitCircle(Circle circle);

    public abstract double visitSquare(Square circle);

}
