
package sistemaestoque;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class SistemaEstoque {

    public static void main(String[] args) {
    List<Gerente> listagerente = new ArrayList<>();
    List<Atendente> listaatendente = new ArrayList<>();
    List<Vendedor> listavendedor = new ArrayList<>();
    List<Cliente> listacliente = new ArrayList<>();
    List<Produto> listaproduto = new ArrayList<>();
    while(true) {
    
    int menu = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar cliente | 2- Cadastrar Funcionário | 3- Cadastrar Produto | 4- Exibir Cliente | 5- Exibir Funcionário | 6- Exibir Produto"));
    switch(menu) {
        case 1:
            Cliente cliente = new Cliente();
            cliente.cadastrarcliente();
            listacliente.add(cliente);
            break;
        
        case 2:
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Tipo de funcionário [1- Gerente | 2- Atendente | 3- Vendedor]"));
            switch(opc) {
                
                case 1:    
                    Gerente gerente = new Gerente();
                    gerente.cadastrargerente();
                    listagerente.add(gerente);
                    break;  
                
                case 2:    
                    Atendente atendente = new Atendente();
                    atendente.cadastrarAtendente();
                    listaatendente.add(atendente);
                    break;
                
                case 3:    
                    //Vendedor vendedor = new Vendedor();
                    Vendedor vendedor = new Vendedor();
                    vendedor.cadastrarVendedor();
                    listavendedor.add(vendedor);
                    break;    
            }
            break;
        
        case 3:
            Produto produto = new Produto();
            produto.cadastrarproduto();
            listaproduto.add(produto);
            break;
            
        case 4:
            for(Cliente clientes : listacliente) {
                clientes.exibircliente();
            }
            break;
       
        case 5:
            int opc1 = Integer.parseInt(JOptionPane.showInputDialog("Tipo de funcionário [1- Gerente | 2- Atendente | 3- Vendedor]"));
            switch(opc1) {
                case 1: 
                    JOptionPane.showMessageDialog(null, "Função: Gerente");
                    for(Gerente gerente : listagerente) {
                     gerente.exibirgerente();   
                    }
                    break;
                
                case 2:
                    JOptionPane.showMessageDialog(null, "Função: Atendente");
                    for(Atendente atendente : listaatendente) {
                     atendente.exibirAtendente();   
                    }
                    break;
                
                case 3:
                    JOptionPane.showMessageDialog(null, "Função: Vendedor");
                    for(Vendedor vendedor : listavendedor) {
                     vendedor.exibirVendedor();   
                    }
                    break;
            }  
            break;
            
        case 6:
            for(Produto produtos : listaproduto) {
                produtos.exibirproduto();
            }
            break;
            
    }
    }
}
    
} 
