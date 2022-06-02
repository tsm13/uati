package br.com.uati.api.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DadosExtratoDTO implements APIDto {

	@JsonProperty
	private LocalDate dataLancamento;

	@JsonProperty
	private String lancamento;

	@JsonProperty
	private Double valor;

	@JsonProperty
	private String detalhes;

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
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
