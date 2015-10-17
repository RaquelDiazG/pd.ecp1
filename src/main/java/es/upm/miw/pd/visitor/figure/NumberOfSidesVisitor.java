package es.upm.miw.pd.visitor.figure;

public class NumberOfSidesVisitor extends Visitor {

    @Override
    public double visitTriangle(Triangle triangle) {
        return 3;
    }

    @Override
    public double visitCircle(Circle circle) {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public double visitSquare(Square circle) {
        return 4;
    }

}
