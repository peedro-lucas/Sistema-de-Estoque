
package sistemaestoque;

import javax.swing.JOptionPane;


public class Cliente {
     private String nome;
    private String cpf;
    private String telefone;
    
    public void cadastrarcliente(){
        this.nome = JOptionPane.showInputDialog("Nome");
        this.cpf = JOptionPane.showInputDialog("CPF");
        this.telefone = JOptionPane.showInputDialog("Telefone");
    }
    public void exibircliente(){
        JOptionPane.showMessageDialog(null, "Nome" + this.nome + "\nCPF: " + this.cpf + "\ntelefone" + this.telefone);
    
    
}
}
