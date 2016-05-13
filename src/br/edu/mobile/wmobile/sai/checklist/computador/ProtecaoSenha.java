package br.edu.mobile.wmobile.sai.checklist.computador;

import java.util.ArrayList;
import java.util.List;

public class ProtecaoSenha implements IVerComputador {

	private IVerComputador anterior;

	public ProtecaoSenha(IVerComputador anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Proteção por Senha";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("O computador deve solicitar senha para utilizar o sistema.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Configurar senha para o(s) usuário(s).\n");

		return solucao;
	}

}
