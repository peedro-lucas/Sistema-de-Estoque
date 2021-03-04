
package sistemaestoque;
import javax.swing.JOptionPane;

public class Atendente extends Funcionario{
    private String funcao;
    private String nome;
    private String telefone;
    
    public void cadastrarAtendente(){
        this.funcao = JOptionPane.showInputDialog("Função");
        this.nome = JOptionPane.showInputDialog("Nome");
        this.telefone = JOptionPane.showInputDialog("Telefone");
    }
    public void exibirAtendente(){
        JOptionPane.showMessageDialog(null, "Função " + this.funcao + "\nNome " + this.nome + "\nTelefone " + this.telefone);
    }
}
