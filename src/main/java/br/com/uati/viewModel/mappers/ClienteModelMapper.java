package br.com.uati.viewModel.mappers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.uati.api.model.APIDto;
import br.com.uati.api.model.ContaCorrenteDTO;
import br.com.uati.api.model.DadosExtratoDTO;
import br.com.uati.api.model.ExtratoDTO;
import br.com.uati.api.model.SaldoDTO;
import br.com.uati.api.model.StatusLancamento;
import br.com.uati.viewModel.model.ContaCorrenteView;
import br.com.uati.viewModel.model.DadosExtratoView;
import br.com.uati.viewModel.model.ExtratoView;
import br.com.uati.viewModel.model.SaldoView;

public class ClienteModelMapper {

	private ClienteModelMapper() {
	}

	// Conta Corrente
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

	// Saldo
	public static SaldoView fromSaldoDto(APIDto dto) {
		if (dto != null) {
			SaldoDTO saldoDTO = (SaldoDTO) dto;
			SaldoView saldoViewModel = new SaldoView();
			saldoViewModel.setSaldoTotal(saldoDTO.getSaldo() + saldoDTO.getLis());
			return saldoViewModel;
		}
		return null;
	}

	// Extrato
	public static ExtratoView fromExtratoDto(APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();
			DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			for (DadosExtratoDTO dados : extratoDTO.getDados()) {
				DadosExtratoView dadosExtratoView = new DadosExtratoView();

				dadosExtratoView.setDataLancamento(formatData.format(dados.getDataLancamento()));
				dadosExtratoView.setDetalhes(dados.getDetalhes());
				dadosExtratoView.setLancamento(dados.getLancamento());
				dadosExtratoView.setValor(dados.getValor());

				if (dados.getDataLancamento().isAfter(LocalDate.now())) {
					dadosExtratoView.setFuturoOuPassado(StatusLancamento.FUTURO);
				} else {
					dadosExtratoView.setFuturoOuPassado(StatusLancamento.PASSADO);
				}

				if (dadosExtratoView.getValor() > 0) {
					dadosExtratoView.setEntradaOuSaida(StatusLancamento.ENTRADA);
				} else {
					dadosExtratoView.setEntradaOuSaida(StatusLancamento.SAIDA);
				}

				extratoViewModel.getDados().add(dadosExtratoView);
			}
			return extratoViewModel;
		}
		return null;
	}
}
