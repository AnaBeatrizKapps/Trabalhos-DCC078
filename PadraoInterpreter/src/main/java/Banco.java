public class Banco {

    public static String formula = "diasAtraso * 0.033 / 100 * valor + valor";

    public static double calcularValorComJuros(double valor, int diasAtraso) {
        String expressao;
        expressao = formula.replace("valor", Double.toString(valor));
        expressao = expressao.replace("diasAtraso", Integer.toString(diasAtraso));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
