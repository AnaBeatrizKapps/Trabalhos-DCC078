public class GestaoDePessoas extends Setor {

    private static GestaoDePessoas gestaoDePessoas = new GestaoDePessoas();

    private GestaoDePessoas() {}

    public static GestaoDePessoas getInstancia() {
        return gestaoDePessoas;
    }

}