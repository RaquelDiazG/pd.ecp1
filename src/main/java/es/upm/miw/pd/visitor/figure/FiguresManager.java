package es.upm.miw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figure> figures;

    private Visitor areaVisitor;

    private Visitor numberOfSidesVisitor;

    public FiguresManager() {
        figures = new ArrayList<>();
        areaVisitor = new AreaVisitor();
        numberOfSidesVisitor = new NumberOfSidesVisitor();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public double totalArea() {
        double result = 0;
        for (Figure figure : figures) {
            result += figure.area(areaVisitor);
        }
        return result;
    }

    public double totalNumberOfSides() {
        double result = 0;
        for (Figure figure : figures) {
            result += figure.numberOfSides(numberOfSidesVisitor);
        }
        return result;
    }

}
