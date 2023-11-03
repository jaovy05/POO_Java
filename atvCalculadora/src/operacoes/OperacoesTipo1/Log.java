package operacoes.OperacoesTipo1;

public class Log extends Operacao1{

    public Log(){
        super("log");
    }

    public double executar(int x){
        return truncarValor(Math.log10(x), 0);
    }

    public double executar(double x){
        return truncarValor(Math.log10(x), precisao);
    }

    public double executar(double x, int precisao){
        return truncarValor(Math.log10(x), precisao);
    }
}
