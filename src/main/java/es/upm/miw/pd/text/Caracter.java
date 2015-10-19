package es.upm.miw.pd.text;

public class Caracter extends Componente {

    private char caracter;

    public Caracter(char caracter) {
        this.caracter = caracter;
    }

    @Override
    public void add(Componente componente) {
        // ignorar
    }

    @Override
    public void remove(Componente componente) {
        // ignorar
    }

    @Override
    public String dibujar(boolean mayusculas) {
        if (mayusculas) {
            return String.valueOf(Character.toUpperCase(caracter));
        }
        return String.valueOf(caracter);
    }

    @Override
    public boolean isComposite() {
        return false;
    }

}
