package br.com.uati.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtratoDTO implements APIDto {
	
	@JsonProperty("dados")		
	private List<Dados> dados = new ArrayList<>();

	@JsonProperty("dataLancamento")
	private String dataLancamento;
	
	@JsonProperty("lancamento")
	private String lancamento;
	
	@JsonProperty("valor")
	private Double valor;
	
	@JsonProperty("detalhes")
	private String detalhes;
	
	public List<Dados> getDados() {
		return dados;
	}

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