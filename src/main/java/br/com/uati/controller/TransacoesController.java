package br.com.uati.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

	// Extrato
	@ResponseBody
	@PostMapping("/extrato")
	public ResponseEntity<ViewEntidade> getExtrato(@RequestBody ExtratoESaldoParams params) throws Exception {
		return ResponseEntity.ok().body(ClienteModelMapper.fromExtratoDto(service.getExtrato(params)));
	}
}
