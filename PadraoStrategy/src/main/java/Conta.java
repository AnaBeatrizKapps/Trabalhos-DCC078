public class Conta {

    private float valor;

    public float getValor() {
        return valor;
    }

    public Conta(float valor) {
        this.valor = valor;
    }

    public String pagarEmDinheiro() {
        Pagamento pagamento = new Pagamento(this.valor);
        return pagamento.realizarPagamento(new TipoPagamentoDinheiro());
    }

    public String pagarEmPix() {
        Pagamento pagamento = new Pagamento(this.valor);
        return pagamento.realizarPagamento(new TipoPagamentoPix());
    }

    public String pagarEmCartoCredito() {
        Pagamento pagamento = new Pagamento(this.valor);
        return pagamento.realizarPagamento(new TipoPagamentoCartaoCredito());
    }


}