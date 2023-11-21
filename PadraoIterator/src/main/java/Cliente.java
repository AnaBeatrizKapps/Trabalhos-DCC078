import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cliente implements Iterable<Boleto>{

    private List<Boleto> boletos;

    public Cliente(Boleto... boletos) {
        this.boletos = Arrays.asList(boletos);
    }

    @Override
    public Iterator<Boleto> iterator() {
        return boletos.iterator();
    }

}

