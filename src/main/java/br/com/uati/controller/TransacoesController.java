package br.com.uati.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.uati.api.params.ContaCorrenteParams;
import br.com.uati.api.params.ExtratoESaldoParams;
import br.com.uati.api.service.TesteService;
import br.com.uati.viewModel.ViewEntidade;
import br.com.uati.viewModel.mappers.ClienteModelMapper;

@RestController
public class TransacoesController {
	final TesteService service;

	public TransacoesController(TesteService service) {
		this.service = service;
	}

	// CC
	@ResponseBody
	@PostMapping("/cc")
	public ResponseEntity<ViewEntidade> getCC(@RequestBody ContaCorrenteParams params) throws Exception {
		return ResponseEntity.ok().body(ClienteModelMapper.fromContaCorrenteDto(service.getContaCorrente(params)));
	}

	// Saldo
	@ResponseBody
	@PostMapping("/saldo")
	public ResponseEntity<ViewEntidade> getSaldo(@RequestBody ExtratoESaldoParams params) throws Exception {
		return ResponseEntity.ok().body(ClienteModelMapper.fromSaldoDto(service.getSaldo(params)));
	}

	// Extrato: Geral
	@ResponseBody
	@PostMapping("/extrato")
	public ResponseEntity<ViewEntidade> getExtrato(@RequestBody ExtratoESaldoParams params) throws Exception {
		return ResponseEntity.ok().body(ClienteModelMapper.fromExtratoDto(service.getExtrato(params)));
	}

	// Extrato: Somente Entradas
	@ResponseBody
	@PostMapping("/extratoSomenteEntradas")
	public ResponseEntity<ViewEntidade> getExtratoSomenteEntradas(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromExtratoSomenteEntradasDto(service.getExtratoEntradasFuturas(params)));
	}

	// Extrato: Entradas Passadas
	@ResponseBody
	@PostMapping("/extratoEntradasPassadas")
	public ResponseEntity<ViewEntidade> getExtratoEntradasPassadas(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromExtratoEntradasPassadasDto(service.getExtratoEntradasFuturas(params)));
	}

	// Extrato: Entradas Futuras
	@ResponseBody
	@PostMapping("/extratoEntradasFuturas")
	public ResponseEntity<ViewEntidade> getExtratoEntradasFuturas(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromExtratoEntradasFuturasDto(service.getExtratoEntradasFuturas(params)));
	}

	// Extrato: Somente Saídas
	@ResponseBody
	@PostMapping("/extratoSomenteSaidas")
	public ResponseEntity<ViewEntidade> getExtratoSomenteSaidas(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromExtratoSomenteSaidasDto(service.getExtratoEntradasFuturas(params)));
	}

	// Extrato: Saídas Passadas
	@ResponseBody
	@PostMapping("/extratoSaidasPassadas")
	public ResponseEntity<ViewEntidade> getExtratoSaidasPassadasDto(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromExtratoSaidasPassadasDto(service.getExtratoEntradasFuturas(params)));
	}

	// Extrato: Saídas Futuras
	@ResponseBody
	@PostMapping("/extratoSaidasFuturas")
	public ResponseEntity<ViewEntidade> getExtratoSaidasFuturasDto(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromExtratoSaidasFuturasDto(service.getExtratoEntradasFuturas(params)));
	}

	// Extrato: Lançamentos Futuros
	@ResponseBody
	@PostMapping("/extratoLancamentosFuturos")
	public ResponseEntity<ViewEntidade> getLancamentosFuturos(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromLancamentosFuturosDto(service.getExtratoEntradasFuturas(params)));
	}
	
	// Extrato: Filtro de dias (ontem)
	@ResponseBody
	@PostMapping("/extratoLancamentosOntem")
	public ResponseEntity<ViewEntidade> getLancamentosOntem(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromLancamentosOntem(service.getExtratoEntradasFuturas(params)));
	}
	
	// Extrato: Filtro de dias (7 dias)
	@ResponseBody
	@PostMapping("/extratoLancamentos7Dias")
	public ResponseEntity<ViewEntidade> getLancamentos7Dias(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromLancamentos7Dias(service.getExtratoEntradasFuturas(params)));
	}
	
	// Extrato: Filtro de dias (30 dias)
	@ResponseBody
	@PostMapping("/extratoLancamentos30Dias")
	public ResponseEntity<ViewEntidade> getLancamentos30Dias(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromLancamentos30Dias(service.getExtratoEntradasFuturas(params)));
	}
	
	// Extrato: Filtro de dias (90 dias)
	@ResponseBody
	@PostMapping("/extratoLancamentos90Dias")
	public ResponseEntity<ViewEntidade> getLancamentos90Dias(@RequestBody ExtratoESaldoParams params)
			throws Exception {
		return ResponseEntity.ok()
				.body(ClienteModelMapper.fromLancamentos90Dias(service.getExtratoEntradasFuturas(params)));
	}
}
