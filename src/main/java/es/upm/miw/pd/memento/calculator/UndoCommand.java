package es.upm.miw.pd.memento.calculator;

import upm.jbb.IO;

public class UndoCommand extends ComandAbstract {
    private GestorMementos gestorMementos;

    public UndoCommand(Calculator calculator, GestorMementos gestorMementos) {
        super(calculator);
        this.gestorMementos = gestorMementos;
    }

    @Override
    public void execute() {
        String nombreMemento = IO.getIO().readString();
        Memento memento = gestorMementos.getMemento(nombreMemento);
        super.getCalculator().setTotal(memento.getTotal());
    }

    @Override
    public String name() {
        return "Deshacer";
    }

}
