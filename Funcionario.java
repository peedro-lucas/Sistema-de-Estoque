
package sistemaestoque;

import javax.swing.JOptionPane;

public class Funcionario {
    private String nome;
    private String CPF;
    private String idade;
    private String matricula;
    
    public void cadastrarFuncionario(){
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.CPF = JOptionPane.showInputDialog("CPF: ");
        this.idade = JOptionPane.showInputDialog("idade: ");
        this.matricula = JOptionPane.showInputDialog("matricula: ");
     }
        public void exibirfuncionario(){
        JOptionPane.showMessageDialog(null, "Nome" + this.nome + "\nCPF: " + this.CPF + "\nIdade" + this.idade + "\nMatricula: " + this.matricula);
        }
    
    
    
    
}
