public class Etapa1 extends Etapa {

    public Etapa1(Etapa proximaEtapa) {
        listaDados.add(TipoDadoPessoal.getTipoDadoPessoal());
        setProximaEtapa(proximaEtapa);
    }
    public String getDescricaoEtapa() {
        return "Etapa 1 - Dados Pessoais";
    }
}