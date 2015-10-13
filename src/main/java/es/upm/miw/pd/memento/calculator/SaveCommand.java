package es.upm.miw.pd.memento.calculator;

import upm.jbb.IO;

public class SaveCommand extends ComandAbstract {

    private GestorMementos gestorMementos;

    public SaveCommand(Calculator calculator, GestorMementos gestorMementos) {
        super(calculator);
        this.gestorMementos = gestorMementos;
    }

    @Override
    public void execute() {
        String nombreMemento = IO.getIO().readString();
        gestorMementos.addMemento(nombreMemento, new Memento(super.getCalculator().getTotal()));
    }

    @Override
    public String name() {
        return "Guardar";
    }

}
