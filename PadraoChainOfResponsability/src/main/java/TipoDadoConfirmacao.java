public class TipoDadoConfirmacao implements TipoDado {

    private static TipoDadoConfirmacao tipoDadoConfirmacao = new TipoDadoConfirmacao();

    private TipoDadoConfirmacao() {}

    public static TipoDadoConfirmacao getTipoDadoConfirmacao() {
        return tipoDadoConfirmacao;
    }
}