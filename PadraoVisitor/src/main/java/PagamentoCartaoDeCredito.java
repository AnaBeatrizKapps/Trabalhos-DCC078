public class PagamentoCartaoDeCredito implements Pagamento {

    private int numeroCartao;
    private String validade;
    private int codigoSeguranca;
    private float valor;

    public PagamentoCartaoDeCredito(int numeroCartao, String validade, int codigoSeguranca, float valor) {
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.codigoSeguranca = codigoSeguranca;
        this.valor = valor;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public String getValidade() {
        return validade;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public float getValor() {
        return valor;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPagamentoCartaoDeCredito(this);
    }

}