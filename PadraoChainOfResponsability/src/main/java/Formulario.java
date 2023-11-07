public class Formulario {

    private TipoDado tipoDado;

    public Formulario(TipoDado tipoDado) {
        this.tipoDado = tipoDado;
    }

    public TipoDado getTipoDocumento() {
        return tipoDado;
    }

    public void setTipoDocumento(TipoDado tipoDado) {
        this.tipoDado = tipoDado;
    }

}