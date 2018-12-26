package excecoes;

public class ContatoNaoEncontrado extends Exception {

	//Throwable é a classe que precisa ser extendida para que 
	//seja possível jogar um objeto na pilha (através da palavra reservada throw
	
	//É na classe Throwable que temos praticamente todo o código relacionado 
	//às exceções, inclusive getMessage() e printStackTrace().
	//Todo o resto da hierarquia apenas possui algumas sobrecargas de
	//construtores para comunicar mensagens específicas
	//A hierarquia iniciada com a classe Throwable é dividida em exceções e erros. 
	//Exceções são usadas em códigos de aplicação.
	//Erros são usados exclusivamente pela máquina virtual.
	
	//StackOverflowError é um erro da máquina virtual para 
	//informar que a pilha de execução não tem mais memória.
	
	//Exceções são separadas em duas grandes categorias: aquelas que são 
	//obrigatoriamente verificadas pelo compilador e as que não são verificadas.
	//As primeiras são denominadas checked e são criadas através 
	//do pertencimento a uma hieraquia que não passe por RuntimeException.
	//As segundas são as unchecked, e são criadas como descendentes de RuntimeException.

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContatoNaoEncontrado(String s) {
		super(s);
	}
}
