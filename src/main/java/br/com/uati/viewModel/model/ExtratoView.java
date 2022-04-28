package br.com.uati.viewModel.model;


import java.util.ArrayList;
import java.util.List;

import br.com.uati.api.model.DadosExtratoDTO;
import br.com.uati.viewModel.ViewEntidade;

public class ExtratoView implements ViewEntidade {

	private List<DadosExtratoDTO> dados = new ArrayList<>();	
	
	public List<DadosExtratoDTO> getDados() {
		return dados;
	}
	public void setDados(List<DadosExtratoDTO> dados) {
		this.dados = dados;
	}
}
