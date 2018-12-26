public class TesteConexao {
	
	public static void main(String[] args) {
		
		/*Try com resources
		 *O finally est� declarado implicitamente e executa com ou sem exce��o
		 *	Try-with-resources:
		 *		Automatiza��o do processo de limpeza de um ou mais recursos (Um recurso � qualquer tipo que implemente AutoCloseable)
		 */
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException e) {
			System.err.println(e.getMessage());
			for(Throwable t : e.getSuppressed()) {
				//O java rastreia todas as exce��es que forem lan�adas como (suprimidas)
				//Captura as exce��es que foram suprimidas
				//Ao trabalhar com o try-with-resources � necess�rio capturar todas as exce��es lan�adas
				System.err.println(t.getMessage());
			}
		}
	}
}
