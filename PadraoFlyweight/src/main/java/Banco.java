import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Boleto> boletos = new ArrayList<>();

    public void criarBoleto(float valorBoleto, String nomeSacado, String cpfSacado) {
        Sacado sacado = SacadoFactory.getSacado(nomeSacado, cpfSacado);
        Boleto boleto = new Boleto(valorBoleto, sacado);
        boletos.add(boleto);
    }

    public List<String> obterBoletos() {
        List<String> saida = new ArrayList<String>();
        for (Boleto boleto : this.boletos) {
            saida.add(boleto.obterBoleto());
        }
        return saida;
    }


}