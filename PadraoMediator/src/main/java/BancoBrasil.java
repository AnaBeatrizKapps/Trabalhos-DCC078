public class BancoBrasil implements Banco {

    private static BancoBrasil instancia = new BancoBrasil();

    private BancoBrasil() {}

    public static BancoBrasil getInstancia() {
        return instancia;
    }

    public String receberPagamento(float valor) {
        return "O Banco Brasil realizou o pagamento no valor de R$" + valor;
    }

    public String solicitarEstorno(int idTransacao) {
        return "O Banco Brasil aprovou o estorno da trasancao " + idTransacao;
    }
}