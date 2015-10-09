package es.upm.miw.pd.state.connection;

public class Preparado extends State{

    @Override
    public void abrir() {
                
    }

    @Override
    public void cerrar() {
      Estado.CERRADO;
        
    }

    @Override
    public void parar() {
        Estado.PARADO;
        
    }

    @Override
    public void iniciar() {
        
        
    }

    @Override
    public void enviar(String msg) {
        this.link.enviar(msg);
      this.estado = Estado.ESPERANDO;
        
    }

    @Override
    public void recibir(int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }

}
