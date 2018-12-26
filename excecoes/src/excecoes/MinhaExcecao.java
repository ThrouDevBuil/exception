package excecoes;

public class MinhaExcecao extends RuntimeException {
	//As exce��es acontecem quando encontra algo inesperado:
	/*
	   � Problemas no hardware
	   � Arrays fora de faixa
	   � Valores de vari�veis
	   � Erro de entrada e sa�da (IO)
	   � Erros da aplica��o
	   � Valores de vari�veis
	     � Divis�o por zero 
	   � Saldo insuficiente
       � Par�metros de m�todos
       � Falha de Mem�ria 
       � Saldo insuficiente
       � Usu�rio n�o existe
       � Nota invalida
    */
	
	//Exce��o � um desvio no fluxo de execu��o
	//normal do programa
	
	//Indica que houve problema na execu��o de
	//um bloco do programa
	
	//O uso correto de exce��es torna o programa
	//mais robusto e confi�vel
	
	public MinhaExcecao(String msg) {
		super(msg);
	}
}
