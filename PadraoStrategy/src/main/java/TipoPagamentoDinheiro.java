public class TipoPagamentoDinheiro implements TipoPagamento {
    public String pagar(float valor) {
        return "Pagamento em dinheiro concluido - Valor: R$"+valor;
    }
}