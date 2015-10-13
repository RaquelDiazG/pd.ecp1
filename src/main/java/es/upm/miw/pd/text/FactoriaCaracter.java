package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private static FactoriaCaracter factoriaCaracter = new FactoriaCaracter(); // PATRON SINGLETON

    private Map<Character, Caracter> caracteres = new HashMap<Character, Caracter>(); // PATRON PESO-LIGERO

    public FactoriaCaracter() {
        // mayusculas
        for (int i = 65; i <= 90; i++) {
            Character c = (char) i;
            caracteres.put(c, new Caracter(c));
        }
        // minusculas
        for (int i = 97; i <= 122; i++) {
            Character c = (char) i;
            caracteres.put(c, new Caracter(c));
        }
    }

    public static FactoriaCaracter getFactoria() {
        return factoriaCaracter;
    }

    public Componente get(char c) {
        return caracteres.get(c);
    }
}
