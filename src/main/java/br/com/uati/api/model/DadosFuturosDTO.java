package br.com.uati.api.model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DadosFuturosDTO implements APIDto {

	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	private List<DadosFuturosDTO> dados;
	
	@JsonProperty
	private String dataLancamento;
	
	@JsonProperty
	private String lancamento;
	
	@JsonProperty
	private Double valor;
	
	@JsonProperty
	private String detalhes;
	
	@JsonProperty
	private StatusLancamento ehFuturo;

	public List<DadosFuturosDTO> getDados() {
		return dados;
	}

	public void setDados(List<DadosFuturosDTO> dados) {
		this.dados = dados;
	}

	public StatusLancamento getEhFuturo() {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dataFormatada = LocalDate.parse(this.dataLancamento, formatador);
		if (dataFormatada.isAfter(LocalDate.now())) {
			return StatusLancamento.FUTURO;
		}
		return StatusLancamento.PASSADO;
	}

	public void setEhFuturo(StatusLancamento ehFuturo) {
		this.ehFuturo = ehFuturo;
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
