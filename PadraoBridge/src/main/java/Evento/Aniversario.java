package Evento;

public class Aniversario extends Evento {

    public Aniversario(float quantidadePessoas) {
        super(quantidadePessoas);
    }

    public float calcularValorFinalEvento() {
        return (this.quantidadePessoas * 100) + this.local.valorAluguel();
    }

}