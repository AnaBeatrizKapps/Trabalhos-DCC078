public class TipoDadoCartao implements TipoDado {

    private static TipoDadoCartao tipoDadoCartao = new TipoDadoCartao();

    private TipoDadoCartao() {}

    public static TipoDadoCartao getTipoDadoCartao() {
        return tipoDadoCartao;
    }
}