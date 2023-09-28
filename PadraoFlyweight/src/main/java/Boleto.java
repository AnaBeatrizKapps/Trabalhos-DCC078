public class Boleto {

    private float valor;
    private Sacado sacado;

    public Boleto(float valor, Sacado sacado) {
        this.valor = valor;
        this.sacado = sacado;
    }

    public String obterBoleto() {
        return "Boleto{" +
                "Valor=' R$ " + this.valor + '\'' +
                ", nome='" + this.sacado.getNome() + '\'' +
                ", cpf='" + this.sacado.getCPF() + '\'' +
                '}';
    }
}