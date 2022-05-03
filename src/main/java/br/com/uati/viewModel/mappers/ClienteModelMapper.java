package br.com.uati.viewModel.mappers;

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
			saldoViewModel.setSaldo(saldoDTO.getSaldo());
			saldoViewModel.setLis(saldoDTO.getLis());
			return saldoViewModel;
		}
		return null;
	}

	// Extrato Geral
	public static ExtratoView fromExtratoDto(APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();

			for (DadosExtratoDTO dados : extratoDTO.getDados()) {
				DadosExtratoView dadosExtratoView = new DadosExtratoView();
				dadosExtratoView.setDataLancamento(dados.getDataLancamento());
				dadosExtratoView.setDetalhes(dados.getDetalhes());
				dadosExtratoView.setLancamento(dados.getLancamento());
				dadosExtratoView.setValor(dados.getValor());
				extratoViewModel.getDados().add(dadosExtratoView);
			}
			return extratoViewModel;
		}
		return null;
	}

	// Extrato: Somente Entradas (Passadas e Futuras)
	public static ExtratoView fromExtratoSomenteEntradasDto(APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();

			for (DadosExtratoDTO dados : extratoDTO.getDados()) {
				DadosExtratoView dadosExtratoView = new DadosExtratoView();
				dadosExtratoView.setDataLancamento(dados.getDataLancamento());
				dadosExtratoView.setDetalhes(dados.getDetalhes());
				dadosExtratoView.setLancamento(dados.getLancamento());
				dadosExtratoView.setValor(dados.getValor());
				if (dadosExtratoView.getEntradaOuSaida() == StatusLancamento.ENTRADA) {
					extratoViewModel.getDados().add(dadosExtratoView);
				}
			}
			return extratoViewModel;
		}
		return null;
	}

	// Extrato: Entradas Passadas
	public static ExtratoView fromExtratoEntradasPassadasDto(APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();

			for (DadosExtratoDTO dados : extratoDTO.getDados()) {
				DadosExtratoView dadosExtratoView = new DadosExtratoView();
				dadosExtratoView.setDataLancamento(dados.getDataLancamento());
				dadosExtratoView.setDetalhes(dados.getDetalhes());
				dadosExtratoView.setLancamento(dados.getLancamento());
				dadosExtratoView.setValor(dados.getValor());
				if (dadosExtratoView.getEntradaOuSaida() == StatusLancamento.ENTRADA
						&& dadosExtratoView.getFuturoOuPassado() == StatusLancamento.PASSADO) {
					extratoViewModel.getDados().add(dadosExtratoView);
				}
			}
			return extratoViewModel;
		}
		return null;
	}

	// Extrato: Entradas Futuras
	public static ExtratoView fromExtratoEntradasFuturasDto(APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();

			for (DadosExtratoDTO dados : extratoDTO.getDados()) {
				DadosExtratoView dadosExtratoView = new DadosExtratoView();
				dadosExtratoView.setDataLancamento(dados.getDataLancamento());
				dadosExtratoView.setDetalhes(dados.getDetalhes());
				dadosExtratoView.setLancamento(dados.getLancamento());
				dadosExtratoView.setValor(dados.getValor());
				if (dadosExtratoView.getEntradaOuSaida() == StatusLancamento.ENTRADA
						&& dadosExtratoView.getFuturoOuPassado() == StatusLancamento.FUTURO) {
					extratoViewModel.getDados().add(dadosExtratoView);
				}
			}
			return extratoViewModel;
		}
		return null;
	}

	// Extrato: Somente Saídas
	public static ExtratoView fromExtratoSomenteSaidasDto(APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();

			for (DadosExtratoDTO dados : extratoDTO.getDados()) {
				DadosExtratoView dadosExtratoView = new DadosExtratoView();
				dadosExtratoView.setDataLancamento(dados.getDataLancamento());
				dadosExtratoView.setDetalhes(dados.getDetalhes());
				dadosExtratoView.setLancamento(dados.getLancamento());
				dadosExtratoView.setValor(dados.getValor());
				if (dadosExtratoView.getEntradaOuSaida() == StatusLancamento.SAIDA) {
					extratoViewModel.getDados().add(dadosExtratoView);
				}
			}
			return extratoViewModel;
		}
		return null;
	}

	// Extrato: Saídas Passadas
	public static ExtratoView fromExtratoSaidasPassadasDto(APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();

			for (DadosExtratoDTO dados : extratoDTO.getDados()) {
				DadosExtratoView dadosExtratoView = new DadosExtratoView();
				dadosExtratoView.setDataLancamento(dados.getDataLancamento());
				dadosExtratoView.setDetalhes(dados.getDetalhes());
				dadosExtratoView.setLancamento(dados.getLancamento());
				dadosExtratoView.setValor(dados.getValor());
				if (dadosExtratoView.getEntradaOuSaida() == StatusLancamento.SAIDA
						&& dadosExtratoView.getFuturoOuPassado() == StatusLancamento.PASSADO) {
					extratoViewModel.getDados().add(dadosExtratoView);
				}
			}
			return extratoViewModel;
		}
		return null;
	}

	// Extrato: Saídas Futuras
	public static ExtratoView fromExtratoSaidasFuturasDto(APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();

			for (DadosExtratoDTO dados : extratoDTO.getDados()) {
				DadosExtratoView dadosExtratoView = new DadosExtratoView();
				dadosExtratoView.setDataLancamento(dados.getDataLancamento());
				dadosExtratoView.setDetalhes(dados.getDetalhes());
				dadosExtratoView.setLancamento(dados.getLancamento());
				dadosExtratoView.setValor(dados.getValor());
				if (dadosExtratoView.getEntradaOuSaida() == StatusLancamento.SAIDA
						&& dadosExtratoView.getFuturoOuPassado() == StatusLancamento.FUTURO) {
					extratoViewModel.getDados().add(dadosExtratoView);
				}
			}
			return extratoViewModel;
		}
		return null;
	}

	// Extrato: Lançamentos Futuros
	public static ExtratoView fromLancamentosFuturosDto(APIDto dto) {
		if (dto != null) {
			ExtratoDTO extratoDTO = (ExtratoDTO) dto;
			ExtratoView extratoViewModel = new ExtratoView();

			for (DadosExtratoDTO dados : extratoDTO.getDados()) {
				DadosExtratoView dadosExtratoView = new DadosExtratoView();
				dadosExtratoView.setDataLancamento(dados.getDataLancamento());
				dadosExtratoView.setDetalhes(dados.getDetalhes());
				dadosExtratoView.setLancamento(dados.getLancamento());
				dadosExtratoView.setValor(dados.getValor());
				if (dadosExtratoView.getFuturoOuPassado() == StatusLancamento.FUTURO) {
					extratoViewModel.getDados().add(dadosExtratoView);
				}
			}
			return extratoViewModel;
		}
		return null;
	}
}
