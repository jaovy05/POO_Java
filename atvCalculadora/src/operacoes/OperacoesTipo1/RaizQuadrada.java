package operacoes.OperacoesTipo1;

public class RaizQuadrada extends Operacao1{

    public RaizQuadrada() {
        super("sqrt");
    }

    @Override
    public double executar(int x) {
        if(x < 0) throw new ArithmeticException("Não existe raiz de um número negativo.");
        return truncarValor(Math.sqrt(x), 0);
    }

    @Override
    public double executar(double x) {
        if(x < 0) throw new ArithmeticException("Não existe raiz de um número negativo.");
        return truncarValor(Math.sqrt(x), precisao);
    }

    @Override
    public double executar(double x, int precisao) {
        if(x < 0) throw new ArithmeticException("Não existe raiz de um número negativo.");
        return truncarValor(Math.sqrt(x), precisao);
    }
}
