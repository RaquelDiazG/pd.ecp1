package es.upm.miw.pd.memento.calculator;

public class Memento {

    private int total;

    private String cadena;

    public Memento(int total, String cadena) {
        this.total = total;
        this.cadena = cadena;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int totalCalculadora) {
        this.total = totalCalculadora;
    }

    public String getCadena() {
        return this.cadena;
    }
}
