package br.com.uati.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtratosFuturosDTO implements APIDto {
	
	@JsonProperty("dados")		
	private List<DadosFuturosDTO> dados = new ArrayList<>();

	public List<DadosFuturosDTO> getDados() {
		return dados;
	}

	public void setDados(List<DadosFuturosDTO> dados) {
		this.dados = dados;
	}
}