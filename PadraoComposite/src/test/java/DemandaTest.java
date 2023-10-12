import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemandaTest {
    @Test
    void deveRetornarDescricaoDemanda() {
        Etapa etapa1 = new Etapa("Conversar com o Cliente");

        Etapa etapa2 = new Etapa("Desenvolver o back end");
        Tarefa tarefa21 = new Tarefa("Desenvolver rota 1", 2);
        etapa2.addConteudo(tarefa21);

        Etapa etapa3 = new Etapa("Desenvolver o front end");
        Tarefa tarefa31 = new Tarefa("Desenvolver tela 1", 3);
        Tarefa tarefa32 = new Tarefa("Desenvolver tela 2", 4);
        etapa3.addConteudo(tarefa31);
        etapa3.addConteudo(tarefa32);

        Etapa definicao = new Etapa("Demanda 1");
        definicao.addConteudo(etapa1);
        definicao.addConteudo(etapa2);
        definicao.addConteudo(etapa3);

        Demanda demanda = new Demanda();
        demanda.setDefinicao(definicao);

        assertEquals("Etapa: Demanda 1\n" +
                        "Etapa: Conversar com o Cliente\n" +
                        "Etapa: Desenvolver o back end\n" +
                        "Tarefa: Desenvolver rota 1 - Estimativa de Tempo: 2\n" +
                        "Etapa: Desenvolver o front end\n" +
                        "Tarefa: Desenvolver tela 1 - Estimativa de Tempo: 3\n" +
                        "Tarefa: Desenvolver tela 2 - Estimativa de Tempo: 4\n",
                demanda.getDefinicao());

    }

    @Test
    void deveRetornarExecacaoDemandaSemDefinicao() {
        try {
            Demanda demanda = new Demanda();
            demanda.getDefinicao();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Demanda sem definição", e.getMessage());
        }
    }
}