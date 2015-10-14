package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

    private NaturalNumberCreator creator;

    private NaturalNumber naturalNumber;

    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }

    public void createNaturalNumber() {
        this.naturalNumber = this.creator.createNaturalNumber();
    }

    public NaturalNumber getNaturalNumber() {
        return naturalNumber;
    }
}
