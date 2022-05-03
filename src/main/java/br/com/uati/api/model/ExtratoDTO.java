package br.com.uati.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.uati.viewModel.model.DadosExtratoView;

public class ExtratoDTO implements APIDto {
	
	@JsonProperty("dados")		
	private List<DadosExtratoDTO> dados = new ArrayList<>();

	public List<DadosExtratoDTO> getDados() {
		return dados;
	}

	public void setDados(List<DadosExtratoDTO> dados) {
		this.dados = dados;
	}
}