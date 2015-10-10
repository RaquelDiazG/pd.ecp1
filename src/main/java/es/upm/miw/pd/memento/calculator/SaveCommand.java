package es.upm.miw.pd.memento.calculator;

public class SaveCommand extends ComandAbstract {

    public SaveCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {

    }

    @Override
    public String name() {
        return "Guardar";
    }

}
