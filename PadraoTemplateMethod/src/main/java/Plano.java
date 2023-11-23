public abstract class Plano {

    private int quantidadeVinhos;
    private float valor;
    public abstract Float calcularDesconto();

    public float getQuantidadeVinhos() {
        return quantidadeVinhos;
    }

    public void setQuantidadeVinhos(int quantidadeVinhos) {
        this.quantidadeVinhos = quantidadeVinhos;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipoPlano() {
        return "Essenciais";
    }

    public String getInformacoes() {
        return getTipoPlano() + "{" +
                "valor=" + this.valor +
                ", quantidade_de_vinhos=" + this.quantidadeVinhos +
                ", desconto=" + this.calcularDesconto() +
                '}';
    }
}