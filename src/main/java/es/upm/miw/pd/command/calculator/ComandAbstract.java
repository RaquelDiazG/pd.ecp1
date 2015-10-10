package es.upm.miw.pd.command.calculator;

public abstract class ComandAbstract implements Comando {

    private Calculator calculator; // AGREGACION

    public ComandAbstract(Calculator calculator) {
        super();
        this.calculator = calculator;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    // public void setCalculator(Calculator calculator) {
    // this.calculator = calculator;
    // }

}
