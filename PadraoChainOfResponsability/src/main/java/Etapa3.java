public class Etapa3 extends Etapa {

    public Etapa3(Etapa proximaEtapa) {
        listaDados.add(TipoDadoCartao.getTipoDadoCartao());
        setProximaEtapa(proximaEtapa);
    }
    public String getDescricaoEtapa() {
        return "Etapa 3 - Dados do Cartao";
    }

}