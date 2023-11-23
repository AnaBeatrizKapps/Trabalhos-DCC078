import org.junit.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoSingularesTest {

    @Test
    void deveRetonarDesconto10() {
        PlanoSingulares plano = new PlanoSingulares();
        plano.setValor(100.0f);
        plano.setQuantidadeVinhos(6);
        assertEquals(80.0f, plano.calcularDesconto());
    }

    @Test
    void deveRetonarDesconto0() {
        PlanoSingulares plano = new PlanoSingulares();
        plano.setValor(100.0f);
        plano.setQuantidadeVinhos(2);
        assertEquals(100.0f, plano.calcularDesconto());
    }

    @Test
    void deveRetornarInformacoes() {
        PlanoSingulares plano = new PlanoSingulares();
        plano.setValor(100.0f);
        plano.setQuantidadeVinhos(2);
        assertEquals("Singulares{valor=100.0, quantidade_de_vinhos=2, desconto=100.0}", plano.getInformacoes());
    }
}