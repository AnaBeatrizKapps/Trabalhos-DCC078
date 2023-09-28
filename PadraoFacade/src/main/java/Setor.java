import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Colaborador> colaboradoresComPendencia = new ArrayList<>();

    public void addColaboradorPendente(Colaborador colaborador) {
        this.colaboradoresComPendencia.add(colaborador);
    }

    public boolean verificarColaboradorComPendencia(Colaborador colaborador) {
        return this.colaboradoresComPendencia.contains(colaborador);
    }

}
