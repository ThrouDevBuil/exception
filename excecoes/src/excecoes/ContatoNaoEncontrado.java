package excecoes;

public class ContatoNaoEncontrado extends Exception {

	//Throwable � a classe que precisa ser extendida para que 
	//seja poss�vel jogar um objeto na pilha (atrav�s da palavra reservada throw
	
	//� na classe Throwable que temos praticamente todo o c�digo relacionado 
	//�s exce��es, inclusive getMessage() e printStackTrace().
	//Todo o resto da hierarquia apenas possui algumas sobrecargas de
	//construtores para comunicar mensagens espec�ficas
	//A hierarquia iniciada com a classe Throwable � dividida em exce��es e erros. 
	//Exce��es s�o usadas em c�digos de aplica��o.
	//Erros s�o usados exclusivamente pela m�quina virtual.
	
	//StackOverflowError � um erro da m�quina virtual para 
	//informar que a pilha de execu��o n�o tem mais mem�ria.
	
	//Exce��es s�o separadas em duas grandes categorias: aquelas que s�o 
	//obrigatoriamente verificadas pelo compilador e as que n�o s�o verificadas.
	//As primeiras s�o denominadas checked e s�o criadas atrav�s 
	//do pertencimento a uma hieraquia que n�o passe por RuntimeException.
	//As segundas s�o as unchecked, e s�o criadas como descendentes de RuntimeException.

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContatoNaoEncontrado(String s) {
		super(s);
	}
}
