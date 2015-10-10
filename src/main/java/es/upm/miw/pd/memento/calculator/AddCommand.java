package es.upm.miw.pd.memento.calculator;

import upm.jbb.IO;

public class AddCommand extends ComandAbstract {

    public AddCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        int num = IO.getIO().readInt();
        super.getCalculator().add(num);
    }

    @Override
    public String name() {
        return "Sumar";
    }

}
