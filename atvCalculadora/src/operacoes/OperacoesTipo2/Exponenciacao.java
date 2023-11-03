package operacoes.OperacoesTipo2;

public class Exponenciacao extends Operacao2{

    public Exponenciacao(){
        super("^");
    }

    @Override
    public double executar(int x, int y){
        
        return Math.pow(x, y);
    }

    @Override
    public double executar(double x, double y) {
        return this.truncarValor(Math.pow(x, y), precisao);
    }

    @Override
    public double executar(double x, double y, int precisao) {
        return this.truncarValor(Math.pow(x, y), precisao);
    }  
}

