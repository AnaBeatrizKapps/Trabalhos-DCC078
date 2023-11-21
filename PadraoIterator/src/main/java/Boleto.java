public class Boleto {

    private Float valor;
    private boolean pago;

    public Boleto(Float valor, boolean pago) {
        this.valor = valor;
        this.pago = pago;
    }

    public boolean isPago() {
        return pago;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}