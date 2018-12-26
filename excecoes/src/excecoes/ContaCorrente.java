package excecoes;

public class ContaCorrente extends Conta {
	private int limite;
	
	public ContaCorrente(double s, int l, Cliente c) {
		super(s, c);
		this.limite = l;
	}
	
	public ContaCorrente() {}

	@Override
	public void saca(double valorParaSaque) throws ContaExcecao {
		valorParaSaque = valorParaSaque + 0.2;
		super.saca(valorParaSaque);
	}

	@Override
	public void deposita(double valorDeposito) throws ContaExcecao {
		
		if(valorDeposito < 0) {
			throw new ContaExcecao("Valor depositado não é aceitável!");
		}
		super.saldo += valorDeposito;
	}

	@Override
	public void transfere(double valorParaSaque, Conta destino) throws ContaExcecao, NullPointerException {
		
		if(destino == null) {
			throw new NullPointerException("Conta de destino inexistente!!");
		}
		super.saca(valorParaSaque);
		destino.deposita(valorParaSaque);
	}
}
