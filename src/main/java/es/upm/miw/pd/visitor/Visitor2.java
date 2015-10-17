package es.upm.miw.pd.visitor;

public class Visitor2 extends Visitor {

    private int contadorA;

    private int contadorB;

    @Override
    public void visitElementA(ElementA e) {
        contadorA++;
    }

    @Override
    public void visitElementB(ElementB e) {
        contadorB++;
    }

    public Object getAs() {
        return contadorA;
    }

    public Object getBs() {
        return contadorB;
    }

}
