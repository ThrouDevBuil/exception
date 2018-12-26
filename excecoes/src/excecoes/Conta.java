package excecoes;

public abstract class Conta {
	protected double saldo;
	private Cliente cliente;
	
	public Conta(double s, Cliente c) {
		this.saldo = s;
		this.cliente = c;
	}
	
	public Conta() {
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void saca(double valorParaSaque) throws ContaExcecao {
		
		if(this.saldo < valorParaSaque) {
			throw new ContaExcecao("Saldo: " + this.saldo + ", insuficiente!!");
		}
		this.saldo -= valorParaSaque;
	}
	public abstract void deposita(double valorDeposito) throws ContaExcecao;
	public abstract void transfere(double valorParaSaque, Conta destino) throws ContaExcecao;
}
