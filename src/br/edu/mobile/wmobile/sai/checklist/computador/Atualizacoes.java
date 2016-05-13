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
		return "Atualizações Automáticas do Sistema";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Verificar se o sistema está com as atualizações automáticas ativadas.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Ativar as atualizações automáticas do sistema.\n");

		return solucao;
	}

}
