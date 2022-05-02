package br.com.uati.viewModel.model;

import java.util.List;

import br.com.uati.api.model.DadosFuturosDTO;
import br.com.uati.viewModel.ViewEntidade;

public class ExtratosFuturosView implements ViewEntidade { 

	private List<DadosFuturosDTO> dados;	

	public List<DadosFuturosDTO> getDados() {
		return dados;
	}
	
	public void setDados(List<DadosFuturosDTO> dados) {
		this.dados = dados;
	}		
}
