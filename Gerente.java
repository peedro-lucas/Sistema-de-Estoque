package sistemaestoque;
import javax.swing.JOptionPane;

public class Gerente extends Funcionario{
    private String funcao;

    public void cadastrargerente(){
        super.cadastrarFuncionario();
        this.funcao = "Gerente";
    }
    public void exibirgerente(){
        super.exibirfuncionario();
        JOptionPane.showMessageDialog(null, "Função " + this.funcao);
    }
    
}
