package Aula2;

public class Conta {
	private int nroConta;
	private String nomeConta;
	private double saldo;
	private String data;
	
	//Usando Alt + Shift + S, voce pode criar o construtor e o get/set.
	public Conta(int nroConta, String nomeConta, double saldo, String data) {
		super();
		this.nroConta = nroConta;
		this.nomeConta = nomeConta;
		this.saldo = saldo;
		this.data = data;
	}
	
	
	public Conta() {
		super();
	}


	public int getNroConta() {
		return nroConta;
	}
	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}
	public String getNomeConta() {
		return nomeConta;
	}
	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}	

}

