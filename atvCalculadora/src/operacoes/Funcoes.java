package operacoes;


public class Funcoes {
    private String simbolo;
    public static int precisao = 2;

    public Funcoes(String simbolo){
        this.simbolo = simbolo;
    }

    public String getSimbolo(){
        return this.simbolo;
    } 

    @Override
    public String toString(){
        return " " + this.simbolo + " ";
    }

    public double truncarValor(double x, int precisao){
        if (precisao > 10){
            precisao = 10; 
            // A precisão deve ser limitada para não estourar o tamanho máximo do long ao truncar o número
            System.out.println("Valor informado para a precisão não suportado. Foi utilizado o valor 10 para a precisão.");
        }
        double escala = Math.pow(10,  precisao);
        long aux = (long) (x * escala);
        return (double) aux/escala;
    }
    
}
