package Evento;

public class Formatura extends Evento {

    private int formandos;

    public Formatura(float quantidadePessoas) {
        super(quantidadePessoas);
    }

    public void setFormandos(int formandos) {
        this.formandos = formandos;
    }

    public float calcularValorFinalEvento() {
        return (this.quantidadePessoas * 200) + (this.formandos*100) + this.local.valorAluguel();
    }
}