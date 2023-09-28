public class Colaborador {

    public boolean contratar() {
        return ColaboradorFacade.verificarContratacao(this);
    }
}