package State;

public class EstadoCamaraAbierta extends Estado{

    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): ya estaba desbloqueado el telefono";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): la camara ya estaba abierta";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "La foto se va a hacer ya....";
    }
}
