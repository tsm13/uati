package br.com.uati.api.service;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.uati.api.model.APIDto;
import br.com.uati.api.model.ContaCorrenteDTO;
import br.com.uati.api.model.ExtratoDTO;
import br.com.uati.api.model.SaldoDTO;
import br.com.uati.api.params.ContaCorrenteParams;
import br.com.uati.api.params.ExtratoESaldoParams;
import br.com.uati.utils.ClientWebTarget;

@Service
public class TesteServiceImpl implements TesteService {
	
	private final static String PATH_SALDO = "/conta/saldo";
	private final static String PATH_EXTRATO = "/transferencias/extrato";
	private final static String PATH_CC = "/conta/conta-corrente";
	
	private ClientWebTarget webTarget;
	
	@Autowired
	TesteServiceImpl(ClientWebTarget webTarget){
		this.webTarget = webTarget;
	}

	// Conta Corrente
	@Override
	public APIDto getContaCorrente(ContaCorrenteParams params) throws Exception {
		VerificacaoDados verificacao = new VerificacaoDados();
		verificacao.verificaContaESenha(params);
		Response response = this.webTarget
				.client()
				.path(PATH_CC)
				.request()
				.post(Entity.entity(params, MediaType.APPLICATION_JSON_TYPE));
		if (response.getStatus() != HttpStatus.OK.value()) {
			throw new Exception ("Erro de API.");
		}
		return response.readEntity(ContaCorrenteDTO.class);
	}

	// Saldo
	@Override
	public APIDto getSaldo(ExtratoESaldoParams params) throws Exception {
		VerificacaoDados verificacao = new VerificacaoDados();
		verificacao.verificaConta(params);
		Response response = this.webTarget
				.client()
				.path(PATH_SALDO)
				.request()
				.post(Entity.entity(params, MediaType.APPLICATION_JSON_TYPE));
				System.out.println(response);
		if (response.getStatus() != HttpStatus.OK.value()) {
			throw new Exception ("Erro de API.");
		}
		return response.readEntity(SaldoDTO.class);
	}
	
	// Extratos Geral
	@Override
	public APIDto getExtrato(ExtratoESaldoParams params) throws Exception {
		VerificacaoDados verificacao = new VerificacaoDados();
		verificacao.verificaConta(params);
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
	
	// Extrato: Somente Entradas
	@Override
	public APIDto getExtratoSomenteEntradas(ExtratoESaldoParams params) throws Exception {
		VerificacaoDados verificacao = new VerificacaoDados();
		verificacao.verificaConta(params);
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
	
	// Extrato: Entradas Passadas
	@Override
	public APIDto getExtratoEntradasPassadas(ExtratoESaldoParams params) throws Exception {
			VerificacaoDados verificacao = new VerificacaoDados();
			verificacao.verificaConta(params);
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
	
	// Extrato: Entradas Futuras
	@Override
	public APIDto getExtratoEntradasFuturas(ExtratoESaldoParams params) throws Exception {
		VerificacaoDados verificacao = new VerificacaoDados();
		verificacao.verificaConta(params);
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
	
	// Extrato: Somente Saídas
	@Override
	public APIDto getExtratoSomenteSaidas(ExtratoESaldoParams params) throws Exception {
		VerificacaoDados verificacao = new VerificacaoDados();
		verificacao.verificaConta(params);
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

	// Extrato: Saidas Passadas
	@Override
	public APIDto getExtratoSaidasPassadas(ExtratoESaldoParams params) throws Exception {
		VerificacaoDados verificacao = new VerificacaoDados();
		verificacao.verificaConta(params);
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

	// Extrato: Saidas Futuras
	@Override
	public APIDto getExtratoSaidasFuturas(ExtratoESaldoParams params) throws Exception {
		VerificacaoDados verificacao = new VerificacaoDados();
		verificacao.verificaConta(params);
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

	// Extrato: Lançamentos Futuros
	@Override
	public APIDto getExtratoLancamentosFuturos(ExtratoESaldoParams params) throws Exception {
		VerificacaoDados verificacao = new VerificacaoDados();
		verificacao.verificaConta(params);
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
