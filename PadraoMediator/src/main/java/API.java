public class API {

    private static API instancia = new API();

    private API() {}

    public static API getInstancia() {
        return instancia;
    }

    public String realizarPagamentoBancoBrasil(float valor) {
        return "A API recebeu sua solicatacao de pagamento.\n"+
                "O Banco Brasil respondeu sua solicatacao com a mensagem a seguir.\n" +
                ">>" + BancoBrasil.getInstancia().receberPagamento(valor);
    }

    public String solicitarEstornoBancoBrasil(int idTransacao) {
        return "A API recebeu sua solicatacao de estorno.\n"+
                "O Banco Brasil respondeu sua solicatacao com a mensagem a seguir.\n" +
                ">>" + BancoBrasil.getInstancia().solicitarEstorno(idTransacao);
    }

}