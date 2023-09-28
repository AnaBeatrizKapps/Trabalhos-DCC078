import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BancoTest {

    @Test
    void deveRetornarBoletos() {
        Banco banco = new Banco();
        banco.criarBoleto(100.0F, "Zilda", "111.111.111-11");
        banco.criarBoleto(200.0F, "Zilda", "111.111.111-11");
        banco.criarBoleto(300.0F, "Lupercio", "333.333.333-33");
        banco.criarBoleto(400.0F, "Lupercio", "333.333.333-33");

        List<String> saida = Arrays.asList(
                "Boleto{Valor=' R$ 100.0', nome='Zilda', cpf='111.111.111-11'}",
                "Boleto{Valor=' R$ 200.0', nome='Zilda', cpf='111.111.111-11'}",
                "Boleto{Valor=' R$ 300.0', nome='Lupercio', cpf='333.333.333-33'}",
                "Boleto{Valor=' R$ 400.0', nome='Lupercio', cpf='333.333.333-33'}");

        assertEquals(saida, banco.obterBoletos());
    }

    @Test
    void deveRetornarTotalSacados() {
        Banco banco = new Banco();
        banco.criarBoleto(100.0F, "Zilda", "111.111.111-11");
        banco.criarBoleto(200.0F, "Zilda", "111.111.111-11");
        banco.criarBoleto(300.0F, "Lupercio", "333.333.333-33");
        banco.criarBoleto(400.0F, "Lupercio", "333.333.333-33");

        assertEquals(2, SacadoFactory.getTotalSacados());
    }
}