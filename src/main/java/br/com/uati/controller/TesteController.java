package br.com.uati.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.uati.api.params.ExtratoESaldoParams;
import br.com.uati.api.service.TesteService;
import br.com.uati.viewModel.ViewEntidade;
import br.com.uati.viewModel.mappers.ClienteModelMapper;


@RestController
public class TesteController {
	final TesteService service;

	public TesteController(TesteService service) {
		this.service = service;
	}
	
	
	// Saldo
	@ResponseBody
	@PostMapping("/saldo")
	public ResponseEntity<ViewEntidade> getSaldo (@RequestBody ExtratoESaldoParams params) throws Exception {
		return ResponseEntity.ok().body(ClienteModelMapper.fromSaldoDto(service.getSaldo(params)));
	}
	
	// Extrato
	@ResponseBody
	@PostMapping("/extrato")
	public ResponseEntity<ViewEntidade> getExtrato (@RequestBody ExtratoESaldoParams params) throws Exception {
		return ResponseEntity.ok().body(ClienteModelMapper.fromExtratoDto(service.getExtrato(params)));
	}
	
//	// CC
//	@ResponseBody
//	@PostMapping("/contaCorrente")
//	public ResponseEntity<ViewEntidade> getCC (@RequestBody APIParams params) throws Exception {
//		return ResponseEntity.ok().body(ClienteModelMapper.fromDto(service.getTeste(params)));
//	}
	
	
	
	
	
	//	Apagar depois: Teste Get externo (String)
	@GetMapping("/testeGet")
	public String testeGet() {
		String uri = "https://jsonplaceholder.typicode.com/todos/";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}
}
