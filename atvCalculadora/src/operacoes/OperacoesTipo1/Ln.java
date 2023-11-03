package operacoes.OperacoesTipo1;

public class Ln extends Operacao1{

    public Ln(){
        super("ln");
    }

    public double executar(int x){
        return truncarValor(Math.log(x), 0);
    }

    public double executar(double x){
        return truncarValor(Math.log(x), precisao);
    }

    public double executar(double x, int precisao){
        return truncarValor(Math.log(x), precisao);
    }
}
