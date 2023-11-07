public class PagamentoVisitor implements Visitor {

    public String exibir(Pagamento pagamento) {
        return pagamento.aceitar(this);
    }

    @Override
    public String exibirPagamentoPix(PagamentoPix pagamentoPix) {
        return "PagamentoPix{" +
                "chave Pix=" + pagamentoPix.getChavePix() +
                ", valor=" + pagamentoPix.getValor() +
                '}';
    }

    @Override
    public String exibirPagamentoCartaoDeCredito(PagamentoCartaoDeCredito pagamentoCartaoDeCredito) {
        return "PagamentoCartaoDeCredito{" +
                "numero cartao=" + pagamentoCartaoDeCredito.getNumeroCartao() +
                ", validade='" + pagamentoCartaoDeCredito.getValidade() + '\'' +
                ", codigo seguranca='" + pagamentoCartaoDeCredito.getCodigoSeguranca() + '\'' +
                ", valor=" + pagamentoCartaoDeCredito.getValor() +
                '}';
    }

}