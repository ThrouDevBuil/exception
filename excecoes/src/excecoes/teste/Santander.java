package excecoes.teste;

import javax.swing.JOptionPane;

import excecoes.Cliente;
import excecoes.ContaCorrente;
import excecoes.ContaExcecao;

public class Santander {

	public static void main(String[] args) {
		
		boolean operation = false;
		
		Cliente cli = new Cliente("Elvis de Sousa", "860.898.535-77", "(71) 99660-3529", 19);
		
		ContaCorrente cc = new ContaCorrente(600000, 6000000, cli);
	
		ContaCorrente destino = new ContaCorrente();
		
		try {
			cc.deposita(-60000000);
			//Exception genérica
			//Todas as exceções são "exceptions", pois herdam direta
			//ou indiretamente dela.
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		
		JOptionPane.showMessageDialog(null, destino.getSaldo());
	}
}
