package es.upm.miw.pd.state.connection;

public class Esperando extends State {

    @Override
    public void abrir(Conexion conexion) {
        throw new UnsupportedOperationException(MENSAJE_OPERATION_EXCEPTION);
    }

    @Override
    public void cerrar(Conexion conexion) {
        throw new UnsupportedOperationException(MENSAJE_OPERATION_EXCEPTION);
    }

    @Override
    public void parar(Conexion conexion) {
        throw new UnsupportedOperationException(MENSAJE_OPERATION_EXCEPTION);
    }

    @Override
    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException(MENSAJE_OPERATION_EXCEPTION);
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        throw new UnsupportedOperationException(MENSAJE_OPERATION_EXCEPTION);

    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        if (respuesta == 0) {
            conexion.setEstado(new Preparado());
        } else {
            conexion.setEstado(new Cerrado());
        }
    }

    @Override
    public Estado getEstado() {
        return Estado.ESPERANDO;
    }

}
