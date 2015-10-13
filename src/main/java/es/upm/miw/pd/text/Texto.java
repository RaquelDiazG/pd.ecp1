package es.upm.miw.pd.text;

import java.util.Collections;

public class Texto extends Escrito {

    @Override
    public void add(Componente componente) {
        try {
            Escrito escrito = (Escrito) componente;
            documento.add(escrito);
        } catch (Exception e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void remove(Componente componente) {
        try {
            Escrito escrito = (Escrito) componente;
            documento.removeAll(Collections.singleton(escrito));
        } catch (Exception e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public String dibujar(boolean mayusculas) {
        String stringTexto = "";
        for (Componente componente : documento) {
            stringTexto += componente.dibujar(mayusculas);
        }
        return stringTexto + "---o---\n";
    }

}
