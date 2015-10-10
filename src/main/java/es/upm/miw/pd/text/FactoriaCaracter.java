package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    protected static FactoriaCaracter factoriaCaracter = new FactoriaCaracter(); // PATRON SINGLETON

    private Map<char, Caracter> caracteres=new HashMap<char, Caracter>(); // PATRON PESO-LIGERO
   
    public static FactoriaCaracter getFactoria() {
        return factoriaCaracter;
    }
}
