package operacoes.OperacoesTipo2;

public class Soma extends Operacao2{

    public Soma(){
        super("+");
        
    }

    @Override
    public double executar(int x, int y) {
        return x + y;
    }

    @Override
    public double executar(double x, double y) {
        return this.truncarValor(x + y, precisao);
    }

    @Override
    public double executar(double x, double y, int precisao) {
        return this.truncarValor(x + y, precisao);
    }  
}