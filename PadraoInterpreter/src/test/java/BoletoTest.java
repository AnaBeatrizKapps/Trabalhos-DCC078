import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoletoTest {

    @Test
    void deveRecalcularValorBoletoComFormula() {
        Boleto boleto = new Boleto();
        boleto.setValor(100.0);
        boleto.setDiasAtraso(10);

        assertEquals(100.33, boleto.recalcularValorBoleto());
    }

}