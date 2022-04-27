package br.com.uati.api.service;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.uati.api.model.APIDto;
import br.com.uati.api.model.ExtratoDTO;
import br.com.uati.api.model.SaldoDTO;
import br.com.uati.api.params.ExtratoESaldoParams;
import br.com.uati.utils.ClientWebTarget;

@Service
public class TesteServiceImpl implements TesteService {
	
	private final static String PATH_SALDO = "/conta/saldo";
	private final static String PATH_EXTRATO = "/transferencias/extrato";
	
	private ClientWebTarget webTarget;
	
	@Autowired
	TesteServiceImpl(ClientWebTarget webTarget){
		this.webTarget = webTarget;
	}

	@Override
	public APIDto getSaldo(ExtratoESaldoParams params) throws Exception {
		Response response = this.webTarget
				.client()
				.path(PATH_SALDO)
				.request()
				.post(Entity.entity(params, MediaType.APPLICATION_JSON_TYPE));
		if (response.getStatus() != HttpStatus.OK.value()) {
			throw new Exception ("Erro de API.");
		}
		return response.readEntity(SaldoDTO.class);
	}
	
	@Override
	public APIDto getExtrato(ExtratoESaldoParams params) throws Exception {
		Response response = this.webTarget
				.client()
				.path(PATH_EXTRATO)
				.request()
				.post(Entity.entity(params, MediaType.APPLICATION_JSON_TYPE));
		if (response.getStatus() != HttpStatus.OK.value()) {
			throw new Exception ("Erro de API.");
		}
		return response.readEntity(ExtratoDTO.class);
	}
}
