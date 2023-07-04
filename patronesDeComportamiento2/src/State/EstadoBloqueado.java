package State;

public class EstadoBloqueado extends Estado{

    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "desbloquear(): telefono desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara() La camara está bloqueada. Desbloquea el telefono";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto() La camara está bloqueada. Desbloquea el telefono";
    }
}
