
public class Conexao implements AutoCloseable {
	//Ctrl + shift + c = Comentar todas as linhas selecionadas
	public Conexao() {
//		System.out.println("Abrindo conexão!!");
	}
	
	public void leDados() {
//		System.out.println("Lendo dados!!");
		throw new IllegalStateException("Read");
	}

	@Override
	public void close() {
		throw new IllegalStateException("Close");
//		System.out.println("Fechou conexão!!");
	}
}
