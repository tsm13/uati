package br.com.uati.viewModel.mappers;

import br.com.uati.api.model.APIDto;
import br.com.uati.api.model.ExtratoDTO;
import br.com.uati.api.model.SaldoDTO;
import br.com.uati.viewModel.model.ExtratoView;
import br.com.uati.viewModel.model.SaldoView;

public class ClienteModelMapper {
	
	// Aqui é onde são feitas as conversões e formatações

	private ClienteModelMapper() {
	}
	
	public static SaldoView fromSaldoDto (APIDto dto) {
		if (dto != null) {
			SaldoDTO saldoDTO =  (SaldoDTO) dto;
			SaldoView saldoViewModel = new SaldoView();
			saldoViewModel.setSaldo(saldoDTO.getSaldo());
			saldoViewModel.setLis(saldoDTO.getLis());
			saldoViewModel.setSaldoTotal(saldoDTO.getSaldoTotal());
			return saldoViewModel;
		}
		return null;
	}
	
	public static ExtratoView fromExtratoDto (APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();	
			extratoViewModel.setDados(extratoDTO.getDados());
			return extratoViewModel;
		}
		return null;
	}
}
