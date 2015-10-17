package es.upm.miw.pd.visitor.figure;

public abstract class Figure implements Element {

    protected String description;

    public Figure(String description) {
        this.description = description;
    }

}
