package operacoes.OperacoesTipo1;

public class Ln extends Operacao1{

    public Ln(){
        super("ln");
    }

    public double executar(int x){
        if(x <= 0.0) throw new ArithmeticException("Não existe logaritmo de 0 ou números negativos");
        return truncarValor(Math.log(x), 0);
    }

    public double executar(double x){
        if(x <= 0.0) throw new ArithmeticException("Não existe logaritmo de 0 ou números negativos");
        return truncarValor(Math.log(x), precisao);
    }

    public double executar(double x, int precisao){
        if(x <= 0.0) throw new ArithmeticException("Não existe logaritmo de 0 ou números negativos");
        return truncarValor(Math.log(x), precisao);
    }
}
