package operacoes.OperacoesTipo2;

public class Subtracao extends Operacao2{

    public Subtracao(){
        super("-");
    }

    @Override
    public double executar(int x, int y){
        return x - y;
    }

    public double executar(double x, double y){
        return truncarValor(x - y, precisao);
    }

    public double executar(double x, double y, int precisao){
        return truncarValor(x - y , precisao);
    }

    
}
