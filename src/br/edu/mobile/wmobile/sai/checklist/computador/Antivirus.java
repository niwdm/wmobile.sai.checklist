package br.edu.mobile.wmobile.sai.checklist.computador;

import java.util.ArrayList;
import java.util.List;

public class Antivirus implements IVerComputador {

	private IVerComputador anterior;

	public Antivirus(IVerComputador anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Antiv�rus e Vacinas";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("O computador dever� estar com a solu��o de"
				+ " antiv�rus padr�o do instituto e as vacinas atualizadas.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Desinstalar todos os antiv�rus que n�o seja" + " o padr�o e instalar a vers�o mais nova da solu��o"
				+ " utilizada no instituto. Aguardar instalar e atualizar as vacinas.\n");

		return solucao;
	}

}
