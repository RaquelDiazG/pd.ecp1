package es.upm.miw.pd.memento.calculator;

public class UndoCommand extends ComandAbstract {

    public UndoCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {

    }

    @Override
    public String name() {
        return "Deshacer";
    }

}
