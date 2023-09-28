public class AreaTecnica extends Setor {

    private static AreaTecnica areaTecnica = new AreaTecnica();

    private AreaTecnica() {}

    public static AreaTecnica getInstancia() {
        return areaTecnica;
    }
}