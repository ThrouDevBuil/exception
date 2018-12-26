package excecoes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Contato {
	private ArrayList <Agenda> agendas;

	public Contato(ArrayList <Agenda> agendas) {
		super();
		this.agendas = agendas;
	}
	
	public ArrayList<Agenda> getAgendas() {
		return agendas;
	}

	public void setAgendas(ArrayList<Agenda> agendas) {
		this.agendas = agendas;
	}

	public int buscar(String nome) throws ContatoNaoEncontrado {
		
		int i = 0;
		for(Agenda agenda : agendas) {
			
			if(agenda.getNome().equalsIgnoreCase(nome)) {
				return i;
			}
			i++;
		}
		throw new ContatoNaoEncontrado("Contato não está cadastrado!!");
	}
	
	public void update(String newName, int position, String email, String telefone) {
		agendas.get(position).setNome(newName);
		agendas.get(position).setEmail(email);
		agendas.get(position).setTelefone(telefone);
	}
	
	public void imprimeDado(int position) {
		JOptionPane.showMessageDialog(null, "Nome: " + agendas.get(position).getNome()
				+ "\nEmail - " + agendas.get(position).getEmail()
				+ "\nTelefone - " + agendas.get(position).getTelefone());
	}
}
