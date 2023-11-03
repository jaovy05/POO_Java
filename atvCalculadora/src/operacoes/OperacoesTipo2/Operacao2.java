package operacoes.OperacoesTipo2;

import operacoes.Funcoes;

public abstract class Operacao2 extends Funcoes{  
    public Operacao2(String simbolo){
        super(simbolo);
    }

    public abstract double executar(int x, int y);

    public abstract double executar(double x, double y);

    public abstract double executar(double x, double y, int precisao);
}