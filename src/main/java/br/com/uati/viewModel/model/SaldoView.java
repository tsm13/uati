package br.com.uati.viewModel.model;

import br.com.uati.viewModel.ViewEntidade;

public class SaldoView implements ViewEntidade {
	private Double saldo;
	private Double lis;
	private Double saldoTotal;
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getLis() {
		return lis;
	}
	
	public void setLis(Double lis) {
		this.lis = lis;
	}

	public Double getSaldoTotal() {
		return this.saldo + this.lis;
	}

	public void setSaldoTotal(Double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
}
