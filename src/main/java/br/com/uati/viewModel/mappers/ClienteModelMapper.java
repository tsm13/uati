package br.com.uati.viewModel.mappers;

import br.com.uati.api.model.APIDto;
import br.com.uati.api.model.ContaCorrenteDTO;
import br.com.uati.api.model.DadosFuturosDTO;
import br.com.uati.api.model.ExtratoDTO;
import br.com.uati.api.model.ExtratosFuturosDTO;
import br.com.uati.api.model.SaldoDTO;
import br.com.uati.api.model.StatusLancamento;
import br.com.uati.viewModel.model.ContaCorrenteView;
import br.com.uati.viewModel.model.DadosFuturosView;
import br.com.uati.viewModel.model.ExtratoView;
import br.com.uati.viewModel.model.ExtratosFuturosView;
import br.com.uati.viewModel.model.SaldoView;

public class ClienteModelMapper {

	private ClienteModelMapper() {
	}

	public static SaldoView fromSaldoDto(APIDto dto) {
		if (dto != null) {
			SaldoDTO saldoDTO = (SaldoDTO) dto;
			SaldoView saldoViewModel = new SaldoView();
			saldoViewModel.setSaldo(saldoDTO.getSaldo());
			saldoViewModel.setLis(saldoDTO.getLis());
			saldoViewModel.setSaldoTotal(saldoDTO.getSaldoTotal());
			return saldoViewModel;
		}
		return null;
	}

	public static ExtratoView fromExtratoDto(APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();
			extratoViewModel.setDados(extratoDTO.getDados());	
			return extratoViewModel;
		}
		return null;
	}
	
	public static ExtratosFuturosView fromExtratoEntradasFuturasDto(APIDto dto) {
		if (dto != null) {
			ExtratosFuturosDTO extratoDTO = (ExtratosFuturosDTO) dto;
			ExtratosFuturosView extratoViewModel = new ExtratosFuturosView();
			extratoViewModel.setDados(extratoDTO.getDados());	
			
			
			// Retornar apenas um item da lista?
			// E/ou como puxar as propriedades?
			
			
			return extratoViewModel;
		}
		return null;
	}
	
	public static DadosFuturosView fromExtratoEntradasFuturasDtoTeste(APIDto dto) {
		if (dto != null) {
			DadosFuturosDTO extratoDTO = (DadosFuturosDTO) dto;
			DadosFuturosView extratoViewModel = new DadosFuturosView();
			extratoViewModel.setDados(extratoDTO.getDados());
			
			if (extratoViewModel.getEhFuturo() == StatusLancamento.FUTURO) {

				return extratoViewModel;
			}
			
//			extratoViewModel.setDataLancamento(extratoDTO.getDataLancamento());
//			extratoViewModel.setDetalhes(extratoDTO.getDetalhes());
//			extratoViewModel.setEhFuturo(extratoDTO.getEhFuturo());
//			extratoViewModel.setLancamento(extratoDTO.getLancamento());
//			extratoViewModel.setValor(extratoDTO.getValor());

			return null;
	
		}
		return null;
	}


	public static ContaCorrenteView fromContaCorrenteDto(APIDto dto) {
		if (dto != null) {
			ContaCorrenteDTO ccDTO = (ContaCorrenteDTO) dto;
			ContaCorrenteView ccViewModel = new ContaCorrenteView();
			ccViewModel.setAgencia(ccDTO.getAgencia());
			ccViewModel.setConta(ccDTO.getConta());
			ccViewModel.setDac(ccDTO.getDac());
			ccViewModel.setNome(ccDTO.getNome());
			ccViewModel.setSobrenome(ccDTO.getSobrenome());
			return ccViewModel;
		}
		return null;
	}
}
