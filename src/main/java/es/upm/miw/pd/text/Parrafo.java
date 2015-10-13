package es.upm.miw.pd.text;

import java.util.Collections;

public class Parrafo extends Escrito {

    @Override
    public void add(Componente componente) {
        try {
            Caracter caracter = (Caracter) componente;
            documento.add(caracter);
        } catch (Exception e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void remove(Componente componente) {
        try {
            Caracter caracter = (Caracter) componente;
            documento.removeAll(Collections.singleton(caracter));
        } catch (Exception e) {
            throw new UnsupportedOperationException();
        }

    }

    @Override
    public String dibujar(boolean mayusculas) {
        String stringParrafo = "";
        for (Componente componente : documento) {
            stringParrafo += componente.dibujar(mayusculas);
        }
        return stringParrafo + "\n";
    }

}
