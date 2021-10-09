package model.entities;

public class Account {

	private Integer number;
	private String cliente;
	private Double saldo;
	private Double limiteDeSaque;
	
	public Account() {
		
	}

	public Account(Integer number, String cliente, Double saldo, Double limiteDeSaque) {
		this.number = number;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	
	public void deposito(Double quantidade) {
		
	}
	
	public void saque(Double quantidade) {
		
	}
	
	
	
}
