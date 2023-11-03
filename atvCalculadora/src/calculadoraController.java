
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import operacoes.OperacoesTipo2.Divisao;
import operacoes.OperacoesTipo2.Multiplicacao;
import operacoes.OperacoesTipo2.Operacao2;
import operacoes.OperacoesTipo2.Raiz;
import operacoes.OperacoesTipo2.Soma;
import operacoes.OperacoesTipo2.Subtracao;
import operacoes.OperacoesTipo2.Exponenciacao;

public class calculadoraController implements Initializable{
    Double x, y, res;
    Operacao2 []operacoes = {new Soma(), new Subtracao(), new Multiplicacao(), new Divisao(), new Raiz(), new Exponenciacao()};
    //inicia o vetor com todas as operações;
    
    @FXML
    private Button Ans;

    @FXML
    private TitledPane Calculadora;

    @FXML
    private Button Soma;

    @FXML
    private Button Subtracao;

    @FXML
    private Button divisao;

    @FXML
    private Button expoente;

    @FXML
    private Button multiplicacao;

    @FXML
    private Button precisao;

    @FXML
    private Button raiz;

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
    void Somar(ActionEvent event) {
        calcular("+");
    }

    @FXML
    void Subtrair(ActionEvent event) {
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
    void Exponenciacao(ActionEvent event) {
        calcular("^");
    }

    @FXML
    void radiciacao(ActionEvent event) {
        calcular("sqrt");
    }

    @FXML
    void memorianterior(ActionEvent event) {
        //Esse é o ans, pega o valor que estiver no resultado e move para o campo x
        try{
            Double.parseDouble(txtResultado.getText());
            txtX.setText(txtResultado.getText());
        } catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Faça uma operação primeiro", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        txtY.setText(null);
        txtResultado.setText(null);
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

    void calcular(String simbolo){
        try{
            setXY();
            getXY(simbolo);
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
            throw new Exception("O campo X não pode conter texto.");
        } catch (NullPointerException e){
            throw new Exception("O campo X não pode estar vazio.");
        }
        
    }
    
    void getXY(String simbolo) throws Exception{
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
        
        for(Operacao2 op: operacoes)
            if(op.getSimbolo().equals(simbolo))
                return op.executar(x, y);

        throw new RuntimeException("Impossivél.");
    }

}
