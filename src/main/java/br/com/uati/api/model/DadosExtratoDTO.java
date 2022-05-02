package br.com.uati.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DadosExtratoDTO implements APIDto {
	
	@JsonProperty
	private String dataLancamento;
	
	@JsonProperty
	private String lancamento;
	
	@JsonProperty
	private Double valor;
	
	@JsonProperty
	private String detalhes;

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
}
