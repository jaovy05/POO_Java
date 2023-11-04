package operacoes.OperacoesTipo1;

public class RaizCubica extends Operacao1{

    public RaizCubica() {
        super("cbrt");
    }

    @Override
    public double executar(int x) {
        if(x < 0) throw new ArithmeticException("Não existe raiz de um número negativo.");
        return truncarValor(Math.cbrt(x), 0);
    }

    @Override
    public double executar(double x) {
        if(x < 0) throw new ArithmeticException("Não existe raiz de um número negativo.");
        return truncarValor(Math.cbrt(x), precisao);
    }

    @Override
    public double executar(double x, int precisao) {
        if(x < 0) throw new ArithmeticException("Não existe raiz de um número negativo.");
        return truncarValor(Math.cbrt(x), precisao);
    }
}
