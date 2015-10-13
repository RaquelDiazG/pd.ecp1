package es.upm.miw.pd.memento.calculator;

public class Memento {

    private int total;

    public Memento(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int totalCalculadora) {
        this.total = totalCalculadora;
    }

}
