public class TesteConexao {
	
	public static void main(String[] args) {
		
		/*Try com resources
		 *O finally está declarado implicitamente e executa com ou sem exceção
		 *	Try-with-resources:
		 *		Automatização do processo de limpeza de um ou mais recursos (Um recurso é qualquer tipo que implemente AutoCloseable)
		 */
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException e) {
			System.err.println(e.getMessage());
			for(Throwable t : e.getSuppressed()) {
				//O java rastreia todas as exceções que forem lançadas como (suprimidas)
				//Captura as exceções que foram suprimidas
				//Ao trabalhar com o try-with-resources é necessário capturar todas as exceções lançadas
				System.err.println(t.getMessage());
			}
		}
	}
}
