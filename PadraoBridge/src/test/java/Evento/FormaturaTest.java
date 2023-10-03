package Evento;

import Local.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FormaturaTest {
    @Test
    void deveRetornarValorFinalEventoComTerrazo() {
        Local local = new Terrazo();
        Formatura formatura = new Formatura(100);
        formatura.setLocal(local);
        formatura.setFormandos(20);
        Assertions.assertEquals(25000.0F, formatura.calcularValorFinalEvento(), 0.01F);
    }

    @Test
    void deveRetornarValorFinalEventoComPrivilege() {
        Local local = new Privilege();
        Formatura formatura = new Formatura(100);
        formatura.setLocal(local);
        formatura.setFormandos(20);
        Assertions.assertEquals(27000.0F, formatura.calcularValorFinalEvento(), 0.01F);
    }
}