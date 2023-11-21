import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ECommerceTest {

    @Test
    void deveRealizarPagamento() {
        ECommerce ECommerce = new ECommerce();
        assertEquals("""
                        A API recebeu sua solicatacao de pagamento.
                        O Banco Brasil respondeu sua solicatacao com a mensagem a seguir.
                        >>O Banco Brasil realizou o pagamento no valor de R$100.0""",
                ECommerce.pagarBancoBrasil(100.0f));
    }

    @Test
    void deveAprovarEstorno() {
        ECommerce ECommerce = new ECommerce();
        assertEquals("""
                        A API recebeu sua solicatacao de estorno.
                        O Banco Brasil respondeu sua solicatacao com a mensagem a seguir.
                        >>O Banco Brasil aprovou o estorno da trasancao 12345""",
                ECommerce.estornoBancoBrasil(12345));
    }
}