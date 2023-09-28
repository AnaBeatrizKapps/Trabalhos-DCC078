import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ColaboradorTest {
    @Test
    void deveRetornarPendenciaGestaoDePessoas() {
        Colaborador colaborador = new Colaborador();
        GestaoDePessoas.getInstancia().addColaboradorPendente(colaborador);
        Assertions.assertFalse(colaborador.contratar());
    }

    @Test
    void deveRetornarPendenciaAreaTecnica() {
        Colaborador colaborador = new Colaborador();
        AreaTecnica.getInstancia().addColaboradorPendente(colaborador);
        Assertions.assertFalse(colaborador.contratar());
    }

    @Test
    void deveRetornarPendenciaFinanceiro() {
        Colaborador colaborador = new Colaborador();
        Financeiro.getInstancia().addColaboradorPendente(colaborador);
        Assertions.assertFalse(colaborador.contratar());
    }

    @Test
    void deveRetornarColaboradorSemPendenciaContratacao() {
        Colaborador colaborador = new Colaborador();
        Assertions.assertTrue(colaborador.contratar());
    }
}