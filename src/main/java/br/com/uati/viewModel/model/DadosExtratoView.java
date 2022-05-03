package br.com.uati.viewModel.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.uati.api.model.StatusLancamento;

public class DadosExtratoView {

	private String dataLancamento;
	private String lancamento;
	private Double valor;
	private String detalhes;
	//@JsonIgnore 
	private StatusLancamento futuroOuPassado;
	//@JsonIgnore 
	private StatusLancamento entradaOuSaida;
	
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
	public StatusLancamento getFuturoOuPassado() {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dataFormatada = LocalDate.parse(this.dataLancamento, formatador);
		if (dataFormatada.isAfter(LocalDate.now())) {
			return StatusLancamento.FUTURO;
		}
		return StatusLancamento.PASSADO;
	}
	
	public void setFuturoOuPassado(StatusLancamento futuroOuPassado) {
		this.futuroOuPassado = futuroOuPassado;
	}
	
	public StatusLancamento getEntradaOuSaida() {
		if (this.valor > 0) {
			return StatusLancamento.ENTRADA;
		}
		return StatusLancamento.SAIDA;
	}
	
	public void setEntradaOuSaida(StatusLancamento entradaOuSaida) {
		this.entradaOuSaida = entradaOuSaida;
	}	
}