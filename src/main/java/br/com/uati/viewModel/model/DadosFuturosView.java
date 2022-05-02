package br.com.uati.viewModel.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.com.uati.api.model.DadosFuturosDTO;
import br.com.uati.api.model.StatusLancamento;
import br.com.uati.viewModel.ViewEntidade;

public class DadosFuturosView implements ViewEntidade {
	
	private List<DadosFuturosDTO> dados = new ArrayList<>();
	private String dataLancamento;
	private String lancamento;
	private Double valor;
	private String detalhes;
	private StatusLancamento ehFuturo;
	
	
	public List<DadosFuturosDTO> getDados() {
		return dados;
	}

	public void setDados(List<DadosFuturosDTO> dados) {
		this.dados = dados;
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
	

	public StatusLancamento getEhFuturo() {
		return ehFuturo;
	}

	public void setEhFuturo(StatusLancamento ehFuturo) {
		this.ehFuturo = ehFuturo;
	}

	public StatusLancamento lancamentoEhFuturo() {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dataFormatada = LocalDate.parse(this.dataLancamento, formatador);
		if (dataFormatada.isAfter(LocalDate.now())) {
			return StatusLancamento.FUTURO;
		}
		return StatusLancamento.PASSADO;
	}
}

