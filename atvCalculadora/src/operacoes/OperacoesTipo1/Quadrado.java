package operacoes.OperacoesTipo1;

public class Quadrado extends Operacao1{

    public Quadrado() {
        super("^2");
    }

    @Override
    public double executar(int x) {
        return truncarValor(Math.pow(x, 2), 0);
    }

    @Override
    public double executar(double x) {
        return truncarValor(Math.pow(x, 2), precisao);
    }

    @Override
    public double executar(double x, int precisao) {
         return truncarValor(Math.pow(x, 2), precisao);
    }
    
}
