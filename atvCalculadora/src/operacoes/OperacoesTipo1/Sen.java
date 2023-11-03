package operacoes.OperacoesTipo1;

public class Sen extends Operacao1{

    public Sen(){
        super("sin");
    }
    
    public double executar(int x){
        return truncarValor(Math.sin(x), 0);
    }

    public double executar(double x){
        return truncarValor(Math.sin(x), precisao);
    }

    public double executar(double x, int precisao){
        return truncarValor(Math.sin(x), precisao);
    }
}
