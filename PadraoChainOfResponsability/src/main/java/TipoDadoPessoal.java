public class TipoDadoPessoal implements TipoDado {

    private static TipoDadoPessoal tipoDadoPessoal= new TipoDadoPessoal();

    private TipoDadoPessoal() {}

    public static TipoDadoPessoal getTipoDadoPessoal() {
        return tipoDadoPessoal;
    }
}