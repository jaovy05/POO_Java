package operacoes.OperacoesTipo1;

public class Cos extends Operacao1{

    public Cos(){
        super("cos");
    }
    
    public double executar(int x){
        return truncarValor(Math.cos(x), 0);
    }

    public double executar(double x){
        return truncarValor(Math.cos(x), precisao);
    }

    public double executar(double x, int precisao){
        return truncarValor(Math.cos(x), precisao);
    }
}
