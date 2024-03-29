package br.com.uati.api.service;

import br.com.uati.api.model.APIDto;
import br.com.uati.api.params.ContaCorrenteParams;
import br.com.uati.api.params.ExtratoESaldoParams;

public interface TesteService {
	
	public APIDto getContaCorrente(ContaCorrenteParams params) throws Exception;
	public APIDto getSaldo(ExtratoESaldoParams params) throws Exception;
	public APIDto getExtrato(ExtratoESaldoParams params) throws Exception;

}
