package operacoes.OperacoesTipo1;

public class Log extends Operacao1{

    public Log(){
        super("log");
    }

    public double executar(int x){
        if(x <= 0.0) throw new ArithmeticException("Não existe logaritmo de 0 ou números negativos");
        return truncarValor(Math.log10(x), 0);
    }

    public double executar(double x){
        if(x <= 0.0) throw new ArithmeticException("Não existe logaritmo de 0 ou números negativos");
        return truncarValor(Math.log10(x), precisao);
    }

    public double executar(double x, int precisao){
        if(x <= 0.0) throw new ArithmeticException("Não existe logaritmo de 0 ou números negativos");
        return truncarValor(Math.log10(x), precisao);
    }
}
