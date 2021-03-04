package sistemaestoque;
import javax.swing.JOptionPane;

public class Produto {
    private String codigo;
    private String nome;
    private String telefone;
    
    public void cadastrarproduto(){
    this.codigo = JOptionPane.showInputDialog("Nome do produto");
    this.nome = JOptionPane.showInputDialog("Nome do produto");
    }
    public void exibirproduto(){
        JOptionPane.showMessageDialog(null, "Nome" + this.nome + "\ncodigo " + this.codigo + "\telefone " + this.telefone);
    }
}
