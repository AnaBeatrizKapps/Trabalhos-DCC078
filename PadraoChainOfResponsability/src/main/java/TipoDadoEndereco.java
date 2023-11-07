public class TipoDadoEndereco implements TipoDado {

    private static TipoDadoEndereco tipoDadoEndereco = new TipoDadoEndereco();

    private TipoDadoEndereco() {}

    public static TipoDadoEndereco getTipoDadoEndereco() {
        return tipoDadoEndereco;
    }
}