package es.upm.miw.pd.text;

import java.util.Collections;

public class Parrafo extends Escrito {

    @Override
    public void add(Componente componente) {
        if (!componente.isComposite()) {
            componentes.add(componente);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void remove(Componente componente) {
        if (!componente.isComposite()) {
            componentes.removeAll(Collections.singleton(componente));
        } else {
            throw new UnsupportedOperationException();
        }

    }

    @Override
    public String dibujar(boolean mayusculas) {
        String stringParrafo = "";
        for (Componente componente : componentes) {
            stringParrafo += componente.dibujar(mayusculas);
        }
        return stringParrafo + "\n";
    }

    @Override
    public boolean isComposite() {
        return true;
    }
}
