public class TipoPagamentoPix implements TipoPagamento {
    public String pagar(float valor) {
        return "Pagamento em Pix concluido - Valor: R$"+valor;
    }
}