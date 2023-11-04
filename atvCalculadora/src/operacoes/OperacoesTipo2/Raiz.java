package operacoes.OperacoesTipo2;

public class Raiz extends Operacao2{

    public Raiz(){
        super("xrt");
    } 

    public double executar(int x, int y){
        return Math.pow(x, 1 / y);
    }

    public double executar (double x, double y) {
        if(x < 0) throw new ArithmeticException("Não existe raiz de números negativos.");
        if(y == 0) throw new ArithmeticException("Não existe raiz de índice 0.");
        
        return truncarValor(Math.pow(x, 1/y), precisao);
    }

    public double executar(double x, double y, int precisao){
        return truncarValor(Math.pow(x, 1/y), precisao);
    }

    
}
