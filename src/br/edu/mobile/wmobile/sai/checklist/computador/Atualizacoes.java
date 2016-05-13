package br.edu.mobile.wmobile.sai.checklist.computador;

import java.util.ArrayList;
import java.util.List;

public class Atualizacoes implements IVerComputador {
	
	private IVerComputador anterior;

	public Atualizacoes(IVerComputador anterior) {
		this.anterior = anterior;
	}


	@Override
	public String getNome() {
		return "Atualiza��es Autom�ticas do Sistema";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Verificar se o sistema est� com as atualiza��es autom�ticas ativadas.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Ativar as atualiza��es autom�ticas do sistema.\n");

		return solucao;
	}

}
