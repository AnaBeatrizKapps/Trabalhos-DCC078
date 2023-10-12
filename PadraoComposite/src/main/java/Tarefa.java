public class Tarefa extends Conteudo {

    private int estimativaDeTempo;

    public Tarefa(String descricao, int estimativaDeTempo) {
        super(descricao);
        this.estimativaDeTempo = estimativaDeTempo;
    }

    public int getEstimativaDeTempo() {
        return estimativaDeTempo;
    }

    public void setEstimativaDeTempo(int estimativaDeTempo) {
        this.estimativaDeTempo = estimativaDeTempo;
    }

    public String getConteudo() {
        return "Tarefa: " + this.getTexto() + " - Estimativa de Tempo: " + this.estimativaDeTempo + "\n";
    }

}