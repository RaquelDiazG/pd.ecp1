package es.upm.miw.pd.text;

public abstract class Componente {

    public abstract void add(Componente componente);

    public abstract void remove(Componente componente);

    public abstract String dibujar(boolean mayusculas);

    public abstract boolean isComposite();
}
