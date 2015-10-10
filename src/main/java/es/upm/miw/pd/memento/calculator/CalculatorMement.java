package es.upm.miw.pd.memento.calculator;

public class CalculatorMement extends Calculator {

    public CalculatorMement() {
        super();
    }

    public Memento createMemento() {
        return new Memento(super.getTotal());
    }

    public void restoreMemento(Memento memento) {
        super.setTotal(memento.getTotal());
    }

}
