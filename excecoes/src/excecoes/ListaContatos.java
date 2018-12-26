package excecoes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaContatos {

	public static void main(String[] args) {
		ArrayList <String> contatos = new ArrayList<>();
		
		Contato contacts = new Contato(contatos);
		
		int choose = 0;
		
		while(choose == 0) {
			choose = Integer.parseInt(JOptionPane.showInputDialog("Escolha:"
					+ "\n1 - Novo Contato"
					+ "\n2 - Buscar Contato"
					+ "\n3 - Atualizar dados"
					+ "\n4 - Excluir Contato"));
			int position = -1;
			
			switch (choose) {
				case 1:
					String nome = JOptionPane.showInputDialog("Digite o nome: ");
					contatos.add(nome);
					break;
				case 2:
					String buscaContato = JOptionPane.showInputDialog("Insira o nome do contato para busca:");
					
					try {
						position = contacts.buscar(buscaContato);
					} catch (ContatoNaoEncontrado ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
					
					if(position != -1) {
						JOptionPane.showMessageDialog(null, "Contato encontrado!!");
						contacts.imprimeDado(position);
					}
					break;
				case 3: 
					String oldName = JOptionPane.showInputDialog("Digite o nome antigo do contato:");
					position = -1;
					
					try {
						position = contacts.buscar(oldName);
					} catch (ContatoNaoEncontrado ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
					
					if(position != -1) {
						String newName = JOptionPane.showInputDialog("Digite o novo nome: ");
						contacts.update(newName, position);
					}
						
					break;
				case 4:
					
					break;
				default:
					break;
			}
			
			choose = JOptionPane.showConfirmDialog(null, "Deseja continuar no programa?");
		}
	}
}
