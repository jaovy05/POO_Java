import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import operacoes.OperacoesTipo1.Cos;
import operacoes.OperacoesTipo1.Lb;
import operacoes.OperacoesTipo1.Ln;
import operacoes.OperacoesTipo1.Log;
import operacoes.OperacoesTipo1.Operacao1;
import operacoes.OperacoesTipo1.Quadrado;
import operacoes.OperacoesTipo1.RaizCubica;
import operacoes.OperacoesTipo1.RaizQuadrada;
import operacoes.OperacoesTipo1.Cubo;
import operacoes.OperacoesTipo1.Sen;
import operacoes.OperacoesTipo1.Tan;
import operacoes.OperacoesTipo2.Divisao;
import operacoes.OperacoesTipo2.Multiplicacao;
import operacoes.OperacoesTipo2.Operacao2;
import operacoes.OperacoesTipo2.Raiz;
import operacoes.OperacoesTipo2.Soma;
import operacoes.OperacoesTipo2.Subtracao;
import operacoes.OperacoesTipo2.Exponenciacao;

public class calculadoraController implements Initializable{
    Double x, y, res;
    Operacao2 []operacoes2 = {new Soma(), new Subtracao(), new Multiplicacao(), new Divisao(), new Raiz(), new Exponenciacao()};
    Operacao1 []operacoes1 = {new Lb(), new Ln(), new Log(), new Cos(), new Sen(), new Tan(), new Cubo(), new Quadrado(),
            new RaizCubica(), new RaizQuadrada()};
    //inicia o vetor com todas as operações;
    
    @FXML
    private TitledPane Calculadora;

    @FXML
    private Button Cubo;

    @FXML
    private Button Euler;

    @FXML
    private Button ans;

    @FXML
    private Button cosseno;

    @FXML
    private Button divisao;

    @FXML
    private Button expoente;

    @FXML
    private Button instrucoes;

    @FXML
    private Button logaritmo10;

    @FXML
    private Button logaritmo2;

    @FXML
    private Button logaritmoNatural;

    @FXML
    private Button multiplicacao;

    @FXML
    private Button pi;

    @FXML
    private Button precisao;

    @FXML
    private Button quadrado;

    @FXML
    private Button raiz;

    @FXML
    private Button raizCubica;

    @FXML
    private Button raizQuadrada;

    @FXML
    private Button seno;

    @FXML
    private Button soma;

    @FXML
    private Button subtracao;

    @FXML
    private Button tangente;

    @FXML
    private TextField txtResultado;

    @FXML
    private TextField txtX;

    @FXML
    private TextField txtY;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Inicializa os campos como nulos
        txtX.setText(null);
        txtY.setText(null);
        txtResultado.setText(null);
    }

    @FXML
    void somar(ActionEvent event) {
        calcular("+");
    }

    @FXML
    void subtrair(ActionEvent event) {
        calcular("-");
    }

    @FXML
    void dividir(ActionEvent event) {
        calcular("/");
    }

    @FXML
    void multiplicar(ActionEvent event) {
        calcular("x");
    }

    @FXML
    void exponenciacao(ActionEvent event) {
        calcular("^");
    }

    @FXML
    void exponenciacaoQuadrado(ActionEvent event) {
        calcular("^2", txtX);
    }
    
    @FXML
    void exponenciacaoCubo(ActionEvent event) {
        calcular("^3", txtX);
    }

    @FXML
    void radiciacao(ActionEvent event) {
        calcular("xrt");
    }
    
    @FXML
    void radiciacaoCubica(ActionEvent event) {
        calcular("cbrt", txtX);
    }

    @FXML
    void radiciacaoQuadrada(ActionEvent event) {
        calcular("sqrt", txtX);
    }

    @FXML
    void encontrarCos(ActionEvent event) {
        calcular("cos", txtX);
    }

    @FXML
    void encontrarSin(ActionEvent event) {
        calcular("sin", txtX);
    }

    @FXML
    void encontrarTan(ActionEvent event) {
        calcular("tan", txtX);
    }
    
    @FXML
    void log10(ActionEvent event) {
        calcular("log", txtX);
    }

    @FXML
    void logBinario(ActionEvent event) {
        calcular("lb", txtX);
    }

    @FXML
    void logEuler(ActionEvent event) {
        calcular("ln", txtX);
    }

    @FXML
    void setAns(ActionEvent event) {
        //Esse é o ans, pega o valor que estiver no resultado e move para o campo x
        try{
            setInput(Double.parseDouble(txtResultado.getText()));
        } catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Faça uma operação primeiro", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        txtResultado.setText(null);
    }

    @FXML
    void setEuler(ActionEvent event) {
        setInput(Math.E);
    }

    @FXML
    void setPi(ActionEvent event) {
        setInput(Math.PI);
    }

    @FXML
    void setPrecisao(ActionEvent event) {
        try{
            setX();
            int p = Integer.parseInt(txtX.getText());
            if(p < 0) throw new IllegalArgumentException();
            Operacao2.precisao = p;
        } catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Digite um número inteiro positivo.", "Alerta", JOptionPane.WARNING_MESSAGE);
        } 
        txtX.setText(null);
        txtY.setText(null);
        txtResultado.setText(null);
    } 

    @FXML
    private void mostrarMenu(ActionEvent event) {

        String instrucoes = 
            "Bem-vindo à calculadora!\n\n" +
            "Instruções:\n" +
            "1. Entrada de Dados:\n" +
            "   - O campo X é o primeiro valor, e Y é o segundo valor.\n" +
            "   - Para operações trigonométricas e logarítmicas, somente X é necessário.\n" +
            "   - Raízes e exponenciação quadrática ou cúbica requerem apenas X.\n" +
            "   - Outras operações necessitam tanto de X quanto de Y.\n" +
            "2. Escolha da Operação:\n" +
            "   - Selecione a operação desejada (Soma, Subtração, etc.).\n" +
            "   - Use 'Lb' para log na base 2.\n" +
            "   - '-' para X - Y, '/' para X / Y, 'y√' para √X com índice Y, '^' para X^Y.\n" +
            "3. Calcular:\n" +
            "   - Clique no botão correspondente para calcular.\n" +
            "4. Resultado:\n" +
            "   - O resultado será exibido no campo Resultado.\n" +
            "5. Valores Padrão:\n" +
            "   - Botões para valores especiais, como 'Ans' para mover o resultado, 'e' para o número de Euler, 'π' para π.\n" +
            "   - Os valores têm preferência pelo campo X; se o próprio não estiver vazio, são inseridos no Y.\n" +
            "6. Precisão:\n" +
            "   - Use o botão 'Pre' para configurar a precisão (0 a 10).";
        
         
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Instruções");
        alert.setHeaderText(null);
        alert.setContentText(instrucoes);
        alert.showAndWait();
    }

    void calcular(String simbolo){
        try{
            setXY();
            get(simbolo);
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    void calcular(String simbolo, TextField txtX){
        try{
            setX();
            get(simbolo);
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    void setXY() throws Exception{
        //pega o respectivo valor nos campos x e y
        try{
            x = Double.parseDouble(txtX.getText());
            y = Double.parseDouble(txtY.getText());
        } catch(NumberFormatException e) {
            txtX.setText(null);
            txtY.setText(null);
            txtResultado.setText(null);
            throw new Exception("Os campos X e Y não podem conter texto.");
        } catch (NullPointerException e){
            throw new Exception("Os campos X e Y não podem estar vazios.");
        }
        
    }

    void setX() throws Exception{
        try{
            x = Double.parseDouble(txtX.getText());
        } catch(NumberFormatException e) {
            txtX.setText(null);
            txtY.setText(null);
            txtResultado.setText(null);
            throw new Exception("O campo X não pode conter texto.");
        } catch (NullPointerException e){
            throw new Exception("O campo X não pode estar vazio.");
        }
        
    }
    
    void get(String simbolo) throws Exception{
        //coloca o valor de "res(simbolo)" no campo resultado
        try{
            txtResultado.setText(String.valueOf(res(simbolo)));
        } catch(Exception e) {
            txtResultado.setText(null);
            throw new Exception(e.getMessage());
        }
        //deixa os outros campos como null
        txtX.setText(null);
        txtY.setText(null);
    }

    Double res(String simbolo) throws Exception{
        //no for ele procura a operação q for feita pelo simbolo informado
        for(Operacao2 op: operacoes2)
            if(op.getSimbolo().equals(simbolo))
                return op.executar(x, y);

        for(Operacao1 op: operacoes1)
            if(op.getSimbolo().equals(simbolo))
                return op.executar(x);

        throw new RuntimeException("Função não encontrada.");
    }

    void setInput(double valor){
        if(txtX.getText() == null) txtX.setText(String.valueOf(valor));
        else txtY.setText(String.valueOf(valor));
    }
}