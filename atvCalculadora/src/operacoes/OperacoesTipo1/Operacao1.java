package operacoes.OperacoesTipo1;

import operacoes.Funcoes;

public abstract class Operacao1 extends Funcoes{
    
   public Operacao1(String simbolo){
        super(simbolo);
   }

    public abstract double executar(int x);

    public abstract double executar(double x);

    public abstract double executar(double x, int precisao);

    
    
}