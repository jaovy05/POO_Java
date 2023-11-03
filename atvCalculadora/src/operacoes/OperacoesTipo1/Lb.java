package operacoes.OperacoesTipo1;

public class Lb extends Operacao1{

    public Lb(){
        super("lb");
    }

    @Override
    public double executar(int x) {
        return truncarValor(Math.log10(x)/Math.log10(2),2);
    }

    @Override
    public double executar(double x) {
        return truncarValor(Math.log10(x)/Math.log10(2), precisao);
    }

    @Override
    public double executar(double x, int precisao) {
        return truncarValor(Math.log10(x)/Math.log10(2), precisao);
    }
    
}
