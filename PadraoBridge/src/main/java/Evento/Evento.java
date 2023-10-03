package Evento;

import Local.Local;

public abstract class Evento {

    protected Local local;

    protected float quantidadePessoas;

    public Evento(float quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setQuantidadePessoas(float quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public abstract float calcularValorFinalEvento  ();
}