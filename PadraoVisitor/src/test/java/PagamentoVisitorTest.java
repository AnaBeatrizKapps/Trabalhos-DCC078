import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PagamentoVisitorTest {

    @Test
    void deveExibirPagamentoPix() {
        PagamentoPix pagamentoPix = new PagamentoPix("abc123", 100.0f);

        PagamentoVisitor visitor = new PagamentoVisitor();
        assertEquals("PagamentoPix{" +
                "chave Pix=abc123" +
                ", valor=100.0" +
                '}', visitor.exibir(pagamentoPix));
    }

    @Test
    void deveExibirPagamentoCartaoDeCredito() {
        PagamentoCartaoDeCredito pagamentoCartaoDeCredito = new PagamentoCartaoDeCredito(123456, "12/26",987, 100.0f);

        PagamentoVisitor visitor = new PagamentoVisitor();
        assertEquals("PagamentoCartaoDeCredito{" +
                "numero cartao=123456" +
                ", validade='12/26'" +
                ", codigo seguranca='987'" +
                ", valor=100.0" +
                '}', visitor.exibir(pagamentoCartaoDeCredito));
    }


}