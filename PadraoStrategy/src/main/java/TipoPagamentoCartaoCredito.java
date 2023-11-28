public class TipoPagamentoCartaoCredito implements TipoPagamento {
    public String pagar(float valor) {
        return "Pagamento em Cartao de Credido concluido - Valor: R$"+valor;
    }
}