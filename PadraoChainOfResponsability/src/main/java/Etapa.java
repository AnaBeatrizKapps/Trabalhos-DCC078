import java.util.ArrayList;

public abstract class Etapa {

    protected ArrayList listaDados = new ArrayList();
    private Etapa proximaEtapa;

    public Etapa getProximaEtapa() {
        return proximaEtapa;
    }

    public void setProximaEtapa(Etapa proximaEtapa) {
        this.proximaEtapa = proximaEtapa;
    }

    public abstract String getDescricaoEtapa();

    public String preencherDados(Formulario formulario) {
        if (listaDados.contains(formulario.getTipoDocumento())) {
            return getDescricaoEtapa();
        }
        else {
            if (proximaEtapa != null) {
                return proximaEtapa.preencherDados(formulario);
            }
            else
            {
                return "Cadastro Finalizado";
            }
        }
    }
}