package operacoes.OperacoesTipo2;

public class Divisao extends Operacao2{
    //é esse simbolo q a função procura
    public Divisao(){
        super("/");
    }

    @Override
    public double executar(int x, int y){
        return x / y;
    }

    //Por enquanto, é somente esse metodo q utilizo, talvez na frente uso o do int e int
    @Override
    public double executar(double x, double y){
        //precisao tá definida na classe Pai;
        if(y == 0.0) throw new ArithmeticException("Não existe divisão por 0.");
        return truncarValor(x / y, precisao);
    }

    @Override
    public double executar(double x, double y, int precisao){
        return truncarValor(x / y, precisao);
    }

}
