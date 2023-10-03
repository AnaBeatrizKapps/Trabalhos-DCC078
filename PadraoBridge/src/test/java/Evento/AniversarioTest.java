package Evento;
import Local.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AniversarioTest {
    @Test
    void deveRetornarValorFinalEventoComTerrazo() {
        Local local = new Terrazo();
        Aniversario aniversario = new Aniversario(100);
        aniversario.setLocal(local);
        Assertions.assertEquals(13000.0F, aniversario.calcularValorFinalEvento(), 0.01F);
    }

    @Test
    void deveRetornarValorFinalEventoComPrivilege() {
        Local local = new Privilege();
        Aniversario aniversario = new Aniversario(100);
        aniversario.setLocal(local);
        Assertions.assertEquals(15000.0F, aniversario.calcularValorFinalEvento(), 0.01F);
    }


}