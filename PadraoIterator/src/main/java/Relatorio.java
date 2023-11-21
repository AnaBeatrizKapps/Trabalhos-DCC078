import java.util.Iterator;

public class Relatorio {

    public static Integer contarBoletosPagosCliente(Cliente cliente) {
        int quantidade = 0;
        for (Boleto boleto : cliente) {
            if (boleto.isPago()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalBoletosCliente(Cliente cliente) {
        int quantidade = 0;
        for (Iterator a = cliente.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}