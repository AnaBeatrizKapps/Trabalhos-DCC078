public class Demanda {

    private Conteudo definicao;

    public void setDefinicao(Conteudo definicao) {
        this.definicao = definicao;
    }

    public String getDefinicao() {
        if (this.definicao == null) {
            throw new NullPointerException("Demanda sem definição");
        }
        return this.definicao.getConteudo();
    }
}