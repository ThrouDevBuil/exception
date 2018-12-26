package excecoes;

public class MinhaExcecao extends RuntimeException {
	//As exceções acontecem quando encontra algo inesperado:
	/*
	   – Problemas no hardware
	   – Arrays fora de faixa
	   – Valores de variáveis
	   – Erro de entrada e saída (IO)
	   – Erros da aplicação
	   – Valores de variáveis
	     • Divisão por zero 
	   – Saldo insuficiente
       – Parâmetros de métodos
       – Falha de Memória 
       – Saldo insuficiente
       – Usuário não existe
       – Nota invalida
    */
	
	//Exceção é um desvio no fluxo de execução
	//normal do programa
	
	//Indica que houve problema na execução de
	//um bloco do programa
	
	//O uso correto de exceções torna o programa
	//mais robusto e confiável
	
	public MinhaExcecao(String msg) {
		super(msg);
	}
}
