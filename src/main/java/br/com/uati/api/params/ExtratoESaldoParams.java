package br.com.uati.api.params;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtratoESaldoParams implements Params {

	@JsonProperty("agencia")
	private String agencia;
	
	@JsonProperty("conta")
	private String conta;
	
	@JsonProperty("dac")
	private String dac;

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDac() {
		return dac;
	}

	public void setDac(String dac) {
		this.dac = dac;
	}	
}
