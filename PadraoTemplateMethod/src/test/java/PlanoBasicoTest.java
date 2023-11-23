import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoBasicoTest {

    @Test
    void deveRetonarDesconto10() {
        PlanoBasico plano = new PlanoBasico();
        plano.setValor(100.0f);
        plano.setQuantidadeVinhos(5);
        assertEquals(90.0f, plano.calcularDesconto());
    }

    @Test
    void deveRetonarDesconto0() {
        PlanoBasico plano = new PlanoBasico();
        plano.setValor(100.0f);
        plano.setQuantidadeVinhos(2);
        assertEquals(100.0f, plano.calcularDesconto());
    }

    @Test
    void deveRetornarInformacoes() {
        PlanoBasico plano = new PlanoBasico();
        plano.setValor(100.0f);
        plano.setQuantidadeVinhos(2);
        assertEquals("Essenciais{valor=100.0, quantidade_de_vinhos=2, desconto=100.0}", plano.getInformacoes());
    }
}