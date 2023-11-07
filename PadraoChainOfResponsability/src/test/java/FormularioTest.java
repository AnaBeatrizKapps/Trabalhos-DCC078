import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FormularioTest {

    Etapa1 etapa1DadosPessoais;
    Etapa2 etapa2DadosEndereco;
    Etapa3 etapa3DadosCartao;

    @BeforeEach
    void setUp() {
        etapa3DadosCartao = new Etapa3(null);
        etapa2DadosEndereco = new Etapa2(etapa3DadosCartao);
        etapa1DadosPessoais = new Etapa1(etapa2DadosEndereco);
    }

    @Test
    void deveRetornarEtapa1ParaPreencher() {
        assertEquals("Etapa 1 - Dados Pessoais", etapa1DadosPessoais.preencherDados(new Formulario(TipoDadoPessoal.getTipoDadoPessoal())));
    }

    @Test
    void deveRetornarEtapa2ParaPreencher() {
        assertEquals("Etapa 2 - Endereco", etapa1DadosPessoais.preencherDados(new Formulario(TipoDadoEndereco.getTipoDadoEndereco())));
    }

    @Test
    void deveRetornarEtapa3ParaPreencher() {
        assertEquals("Etapa 3 - Dados do Cartao", etapa1DadosPessoais.preencherDados(new Formulario(TipoDadoCartao.getTipoDadoCartao())));
    }

    @Test
    void deveRetornarCadastroFinalizado() {
        assertEquals("Cadastro Finalizado", etapa1DadosPessoais.preencherDados(new Formulario(TipoDadoConfirmacao.getTipoDadoConfirmacao())));
    }

}