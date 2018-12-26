package excecoes;

public class SomaValores {
	private int soma;
	private int[] valores;
	
	public SomaValores(int v1, int v2) {this.valores = valores;}

	public int getSoma() {
		return soma;
	}
	
	public void somar() throws ExcecaoAcimaDeCem {
		int qntd = 0;
		
		for(int valor : valores) {
			
			if(soma > 100) {
				throw new ExcecaoAcimaDeCem("Os números fornecidos para soma ultrapassaram o limite!!"
						+ "\nO programa rodou - " + qntd + " vezes até atingir o limite");
			}
			qntd++;
			soma += valor;
			System.out.println("Soma = " + soma);
		}
	}
}
