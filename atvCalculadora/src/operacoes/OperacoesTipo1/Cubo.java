package operacoes.OperacoesTipo1;

public class Cubo extends Operacao1{
    public Cubo() {
        super("^3");
    }

    @Override
    public double executar(int x) {
        return truncarValor(Math.pow(x, 3), 0);
    }

    @Override
    public double executar(double x) {
        return truncarValor(Math.pow(x, 3), precisao);
    }

    @Override
    public double executar(double x, int precisao) {
         return truncarValor(Math.pow(x, 3), precisao);
    }
}
