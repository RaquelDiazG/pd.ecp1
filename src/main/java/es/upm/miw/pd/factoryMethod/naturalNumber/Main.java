package es.upm.miw.pd.factoryMethod.naturalNumber;

import upm.jbb.IO;

public class Main {
    private NaturalNumberCreator[] creadores = {new NaturalNumberEsCreator(), new NaturalNumberEnCreator(), new NaturalNumberFrCreator()};

    private NaturalNumberCreator creador = creadores[0];

    public void tipoCreador() {
        this.creador = (NaturalNumberCreator) IO.getIO().select(creadores, "Elige un creador");
    }

    public void crearProducto() {
        IO.getIO().println("Creado producto: " + this.creador.createNaturalNumber().getTextValue());
    }

    public static void main(String[] args) {
        IO.getIO().addView(new Main());
    }
}
