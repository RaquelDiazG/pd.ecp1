package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends ComandAbstract {

    public PrintCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        int total = super.getCalculator().getTotal();
        IO.getIO().println(total);

    }

    @Override
    public String name() {
        return "Imprimir";
    }

}
