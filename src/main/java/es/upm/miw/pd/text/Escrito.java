package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Escrito extends Componente {

    protected List<Componente> componentes;

    public Escrito() {
        this.componentes = new ArrayList<Componente>();
    }

    public abstract void add(Componente componente);

    public abstract void remove(Componente componente);

    public abstract String dibujar(boolean mayusculas);

    public abstract boolean isComposite();
}
