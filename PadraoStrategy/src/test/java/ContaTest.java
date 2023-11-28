import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void devePagarComDinheiro() {
        Conta conta = new Conta(80.0f);
        assertEquals("Pagamento em dinheiro concluido - Valor: R$80.0", conta.pagarEmDinheiro());
    }

    @Test
    void devePagarComPix() {
        Conta conta = new Conta(150.0f);
        assertEquals("Pagamento em Pix concluido - Valor: R$150.0", conta.pagarEmPix());
    }

    @Test
    void devePagarComCartaoCredito() {
        Conta conta = new Conta(50.0f);
        assertEquals("Pagamento em Cartao de Credido concluido - Valor: R$50.0", conta.pagarEmCartoCredito());
    }
}