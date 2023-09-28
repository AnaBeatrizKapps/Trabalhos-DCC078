import java.util.HashMap;
import java.util.Map;

public class SacadoFactory {
    private static Map<String, Sacado> sacados = new HashMap<>();

    public static Sacado getSacado(String nome, String cpf) {
        Sacado sacado = sacados.get(cpf);
        if (sacado == null) {
            sacado = new Sacado(nome, cpf);
            sacados.put(cpf, sacado);
        }
        return sacado;
    }

    public static int getTotalSacados() {
        return sacados.size();
    }

}



