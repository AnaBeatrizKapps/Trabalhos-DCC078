public class ColaboradorFacade {

    public static boolean verificarContratacao(Colaborador colaborador) {
        if (GestaoDePessoas.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        if (AreaTecnica.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        return true;
    }
}