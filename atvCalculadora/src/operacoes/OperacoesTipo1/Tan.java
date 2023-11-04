package operacoes.OperacoesTipo1;

public class Tan extends Operacao1{
    public Tan(){
        super("tan");
    }

    public double executar(int x){
        return truncarValor(Math.tan(x), 0);
    }

    public double executar(double x){
        if(Math.cos(x) == 0) throw new ArithmeticException("Não existe tangente para π/2 + kπ, k sendo um inteiro qualquer.");
        return truncarValor(Math.tan(x), precisao);
    }

    public double executar(double x, int precisao){
        return truncarValor(Math.tan(x), precisao);
    }
}
