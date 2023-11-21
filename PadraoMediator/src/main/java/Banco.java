public interface Banco {
    String receberPagamento(float valor);
    String solicitarEstorno(int idTransacao);
}