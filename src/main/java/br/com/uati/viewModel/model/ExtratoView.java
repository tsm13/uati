package br.com.uati.viewModel.model;


import java.util.ArrayList;
import java.util.List;

import br.com.uati.api.model.Dados;
import br.com.uati.viewModel.ViewEntidade;

public class ExtratoView implements ViewEntidade {

	private List<Dados> dados = new ArrayList<>();	
	private String dataLancamento;
	private String lancamento;
	private Double valor;
	private String detalhes;
	
	public List<Dados> getDados() {
		return dados;
	}
	public void setDados(List<Dados> dados) {
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
	
	

}
