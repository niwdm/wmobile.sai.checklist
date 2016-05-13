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
		return "Antivírus e Vacinas";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("O computador deverá estar com a solução de"
				+ " antivírus padrão do instituto e as vacinas atualizadas.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Desinstalar todos os antivírus que não seja" + " o padrão e instalar a versão mais nova da solução"
				+ " utilizada no instituto. Aguardar instalar e atualizar as vacinas.\n");

		return solucao;
	}

}
