package operacoes.OperacoesTipo2;

public class Multiplicacao extends Operacao2 {

    public Multiplicacao(){
        super("x");
    } 

    public double executar(int x, int y){
        return x * y;
    }

    public double executar(double x, double y){
        return truncarValor(x * y, precisao);
    }

    public double executar(double x, double y, int precisao){
        return truncarValor(x * y, precisao);
    }
}
