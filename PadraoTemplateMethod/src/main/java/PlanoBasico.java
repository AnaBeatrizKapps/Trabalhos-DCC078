public class PlanoBasico extends Plano {

    public Float calcularDesconto() {
        if (this.getQuantidadeVinhos() >= 3) {
            return (float) (this.getValor() * 0.9);
        }
        else {
            return this.getValor();
        }
    }

}