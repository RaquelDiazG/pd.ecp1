package es.upm.miw.pd.visitor.figure;

public interface Element {

    double area(Visitor v);

    double numberOfSides(Visitor v);

}
