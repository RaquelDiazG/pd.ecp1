package es.upm.miw.pd.state.connection;

public class Conexion {

    private State estado;
    // private Estado estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new Cerrado();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        // return this.estado;
        return estado.getEstado();
    }

    protected void setEstado(State estado) {
        this.estado = estado;
    }

    public void abrir() {
        estado.abrir(this);
        // if (this.estado == Estado.CERRADO) {
        // this.estado = Estado.PREPARADO;
        // } else if (this.estado == Estado.PARADO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // } else if (this.estado == Estado.PREPARADO) {
        // } else if (this.estado == Estado.ESPERANDO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // } else
        // assert false : "estado imposible";
    }

    public void cerrar() {
        estado.cerrar(this);
        // if (this.estado == Estado.CERRADO) {
        // } else if (this.estado == Estado.PARADO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // } else if (this.estado == Estado.PREPARADO) {
        // this.estado = Estado.CERRADO;
        // } else if (this.estado == Estado.ESPERANDO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // }
        // assert false : "estado imposible";
    }

    public void parar() {
        estado.parar(this);
        // if (this.estado == Estado.CERRADO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // } else if (this.estado == Estado.PARADO) {
        // } else if (this.estado == Estado.PREPARADO) {
        // this.estado = Estado.PARADO;
        // } else if (this.estado == Estado.ESPERANDO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // }
        // assert false : "estado imposible";
    }

    public void iniciar() {
        estado.iniciar(this);
        // if (this.estado == Estado.CERRADO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // } else if (this.estado == Estado.PARADO) {
        // this.estado = Estado.PREPARADO;
        // } else if (this.estado == Estado.PREPARADO) {
        // } else if (this.estado == Estado.ESPERANDO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // }
        // assert false : "estado imposible";
    }

    public void enviar(String msg) {
        estado.enviar(this, msg);
        // if (this.estado == Estado.CERRADO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // } else if (this.estado == Estado.PARADO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // } else if (this.estado == Estado.PREPARADO) {
        // this.link.enviar(msg);
        // this.estado = Estado.ESPERANDO;
        // } else if (this.estado == Estado.ESPERANDO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // }
        // assert false : "estado imposible";
    }

    public void recibir(int respuesta) {
        estado.recibir(this, respuesta);
        // if (this.estado == Estado.CERRADO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // } else if (this.estado == Estado.PARADO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // } else if (this.estado == Estado.PREPARADO) {
        // throw new UnsupportedOperationException("Acción no permitida... ");
        // } else if (this.estado == Estado.ESPERANDO) {
        // if (respuesta == 0) {
        // this.estado = Estado.PREPARADO;
        // } else {
        // this.estado = Estado.CERRADO;
        // }
        // }
        // assert false : "estado imposible";
    }

}
