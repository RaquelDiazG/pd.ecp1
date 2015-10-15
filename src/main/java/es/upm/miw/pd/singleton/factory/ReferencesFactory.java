package es.upm.miw.pd.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public final class ReferencesFactory {

    private static ReferencesFactory factory = new ReferencesFactory(); // Creacion temprana

    private Map<String, Integer> references;

    private int reference;

    public ReferencesFactory() {
        this.references = new HashMap<>();
        this.reference = 0;
    }

    public static ReferencesFactory getFactory() {
        return factory;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

}
