public class Aplicativo {

    public String pagarBancoBrasil(float valor) {
        return API.getInstancia().realizarPagamentoBancoBrasil(valor);
    }

    public String estornoBancoBrasil(int idTransacao) {
        return API.getInstancia().solicitarEstornoBancoBrasil(idTransacao);
    }

}