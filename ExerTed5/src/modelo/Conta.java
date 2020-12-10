package modelo;

public class Conta {
	///atributos
	private int numero;
	private double saldo;
	
	///construtor
	public Conta(int numeroConta,double saldoConta) {
		this.numero = numeroConta;
		this.saldo = saldoConta;
		
	}
	///GET e SET
	public int getNumero() {
		return this.numero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	public String toString() {
		return "numero da conta é = " + this.numero + "e o saldo é de " + this.saldo;
	}

}
