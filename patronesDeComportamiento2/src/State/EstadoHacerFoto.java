package State;

public class EstadoHacerFoto extends Estado{

    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "Telofono ya desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "La camara ya la habiar abierto";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "La foto se ha hecho!!";
    }
}
