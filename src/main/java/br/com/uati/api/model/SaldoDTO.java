package br.com.uati.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaldoDTO implements APIDto {

	@JsonProperty("saldo")
	private Double saldo;
	
	@JsonProperty("lis")
	private Double lis;
	
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
}
