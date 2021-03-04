package sistemaestoque;

import javax.swing.JOptionPane;


public class Vendedor extends Funcionario {
    private String nome;
    private String cpf;
    private String telefone;
    
    public void cadastrarVendedor(){
        this.nome = JOptionPane.showInputDialog("Nome");
        this.cpf = JOptionPane.showInputDialog("CPF");
        this.telefone = JOptionPane.showInputDialog("Telefone");
    }
    public void exibirVendedor(){
        JOptionPane.showMessageDialog(null, "Nome" + this.nome + "\nCPF: " + this.cpf + "\telefone" + this.telefone);
    }
    
}
