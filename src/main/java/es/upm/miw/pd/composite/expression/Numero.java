package es.upm.miw.pd.composite.expression;

public class Numero extends Expresion {

    private int valor;

    public Numero(int numero) {
        this.valor = numero;
    }

    @Override
    public String toString() {
        return "" + valor;
    }

    @Override
    public int operar() {
        return valor;
    }

}
