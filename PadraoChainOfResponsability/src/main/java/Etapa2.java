public class Etapa2 extends Etapa {

    public Etapa2(Etapa proximaEtapa) {
        listaDados.add(TipoDadoEndereco.getTipoDadoEndereco());
        setProximaEtapa(proximaEtapa);
    }
    public String getDescricaoEtapa() {
        return "Etapa 2 - Endereco";
    }

}