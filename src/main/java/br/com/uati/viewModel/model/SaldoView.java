package br.com.uati.viewModel.model;

import br.com.uati.viewModel.ViewEntidade;

public class SaldoView implements ViewEntidade {
	private Double saldoTotal;
	
	public Double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(Double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
}
