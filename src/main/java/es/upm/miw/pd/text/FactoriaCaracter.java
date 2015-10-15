package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private static FactoriaCaracter factoriaCaracter = new FactoriaCaracter(); // PATRON SINGLETON

    private Map<Character, Caracter> caracteres; // PATRON PESO-LIGERO

    public FactoriaCaracter() {
        caracteres = new HashMap<Character, Caracter>();
    }

    public static FactoriaCaracter getFactoria() {
        return factoriaCaracter;
    }

    public Caracter get(char key) {
        if (caracteres.containsKey(key)) {
            return caracteres.get(key);
        } else {
            // Construcción perezosa
            Caracter c = new Caracter(key);
            caracteres.put(key, c);
            return c;
        }
    }
}
