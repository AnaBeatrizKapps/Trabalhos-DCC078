public abstract class Conteudo {

    private String texto;

    public Conteudo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public abstract String getConteudo();
}