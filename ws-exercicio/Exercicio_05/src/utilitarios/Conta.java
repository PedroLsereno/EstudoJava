package utilitarios;

public class Conta {
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public Conta(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		addSaldo(depositoInicial);
	}
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public void removeSaldo(double saldo) {
		this.saldo -= (saldo + 5.00);
	}
	
	public String toString() {
		return "Conta " 
				+ numeroConta 
				+ ", Titular: " 
				+ nome + ", Saldo: " 
				+ String.format("%.2f", saldo);
	}
	
}
