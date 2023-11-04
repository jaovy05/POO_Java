package operacoes.OperacoesTipo1;

public class Lb extends Operacao1{

    public Lb(){
        super("lb");
    }

    @Override
    public double executar(int x){
        if(x <= 0.0) throw new ArithmeticException("Não existe logaritmo de 0 ou números negativos");
        return truncarValor(Math.log10(x)/Math.log10(2),2);
    }

    @Override
    public double executar(double x) {
        if(x <= 0.0) throw new ArithmeticException("Não existe logaritmo de 0 ou números negativos");
        return truncarValor(Math.log10(x)/Math.log10(2), precisao);
    }

    @Override
    public double executar(double x, int precisao) {
        if(x <= 0.0) throw new ArithmeticException("Não existe logaritmo de 0 ou números negativos");
        return truncarValor(Math.log10(x)/Math.log10(2), precisao);
    }
    
}
