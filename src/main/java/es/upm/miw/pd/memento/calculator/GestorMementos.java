package es.upm.miw.pd.memento.calculator;

import java.util.SortedMap;
import java.util.TreeMap;

public class GestorMementos {

    private SortedMap<String, Memento> lista = new TreeMap<String, Memento>();

    public void addMemento(String key, Memento memento) {
        this.lista.put(key, memento);
    }

    public Memento getMemento(String key) {
        return this.lista.get(key);
    }

    public String[] keys() {
        return this.lista.keySet().toArray(new String[0]);
    }
}
