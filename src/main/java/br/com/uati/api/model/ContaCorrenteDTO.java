package br.com.uati.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContaCorrenteDTO implements APIDto {

	@JsonProperty("agencia")
	private String agencia;
	
	@JsonProperty("conta")
	private String conta;
	
	@JsonProperty("dac")
	private String dac;
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("sobrenome")
	private String sobrenome;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	

}
