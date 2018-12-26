package excecoes;

public class ExcecaoComError {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini metodo1");
		try {
			metodo2();
		} catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println(msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Ini metodo 2");
		metodo2();
		System.out.println("Fim do metodo 2");
	}
}
