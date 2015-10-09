package es.upm.miw.pd.state.connection;

public class Parado extends State{

    @Override
    public void abrir() {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public void cerrar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void parar() {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public void iniciar() {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public void enviar(String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public void recibir(int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public Estado getEstado() {
        return Estado.PARADO;
    }

}
