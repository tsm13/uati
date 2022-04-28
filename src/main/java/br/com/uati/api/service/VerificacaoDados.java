package br.com.uati.api.service;

import br.com.uati.api.params.ContaCorrenteParams;
import br.com.uati.api.params.ExtratoESaldoParams;
import br.com.uati.api.params.Params;

public class VerificacaoDados {
	public Params verificaConta(ExtratoESaldoParams paramsVerificados) throws Exception {
		if (paramsVerificados.getAgencia().length() != 4 ) {
			throw new Exception ("Número de agênca inválido.");
		}
		if (paramsVerificados.getConta().length() != 5) {
			throw new Exception ("Número de conta inválido.");
		}
		if (paramsVerificados.getDac().length() != 1) {
			throw new Exception ("DAC inválido.");
		}
		return paramsVerificados;	
	}
	
	public Params verificaContaESenha(ContaCorrenteParams paramsVerificados) throws Exception {
		if (paramsVerificados.getAgencia().length() != 4) {
			throw new Exception ("Número de agênca inválido.");
		}
		if (paramsVerificados.getConta().length() != 5) {
			throw new Exception ("Número de conta inválido.");
		}
		if (paramsVerificados.getDac().length() != 1) {
			throw new Exception ("DAC inválido.");
		}
		if (paramsVerificados.getSenha().equals("123456")) {
			return paramsVerificados;	
		}
		throw new Exception ("Senha inválida.");
	}
}
