public class PlanoSingulares extends Plano {

    public Float calcularDesconto() {
        if (this.getQuantidadeVinhos() >= 4) {
            return (float) (this.getValor() * 0.8);
        }
        else {
            return this.getValor();
        }
    }

    @Override
    public String getTipoPlano() {
        return "Singulares";
    }

}