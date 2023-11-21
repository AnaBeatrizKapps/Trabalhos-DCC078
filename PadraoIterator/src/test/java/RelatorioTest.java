import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void deveContarBoletosPagosCliente() {
        Cliente cliente = new Cliente(
                new Boleto(10.0f, true),
                new Boleto(20.0f, false),
                new Boleto(30.0f, false),
                new Boleto(40.0f, true)
        );
        assertEquals(2, Relatorio.contarBoletosPagosCliente(cliente));
    }

    @Test
    void deveContarTotalBoletosCliente() {
        Cliente cliente = new Cliente(
                new Boleto(10.0f, true),
                new Boleto(20.0f, false),
                new Boleto(30.0f, false),
                new Boleto(40.0f, true)
        );
        assertEquals(4, Relatorio.contarTotalBoletosCliente(cliente));
    }
}