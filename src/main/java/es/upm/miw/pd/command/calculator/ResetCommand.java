package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ResetCommand extends ComandAbstract {

    public ResetCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        super.getCalculator().reset();
        IO.getIO().println();

    }

    @Override
    public String name() {
        return "Resetear";
    }

}
