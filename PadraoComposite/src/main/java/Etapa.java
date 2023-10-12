import java.util.ArrayList;
import java.util.List;

public class Etapa extends Conteudo {

    private List<Conteudo> tarefas;

    public Etapa(String descricao) {
        super(descricao);
        this.tarefas = new ArrayList<>();
    }

    public void addConteudo(Conteudo conteudo) {
        this.tarefas.add(conteudo);
    }

    public String getConteudo() {
        String saida;
        saida = "Etapa: " + this.getTexto() + "\n";
        for (Conteudo tarefa : tarefas) {
            saida += tarefa.getConteudo();
        }
        return saida;
    }
}