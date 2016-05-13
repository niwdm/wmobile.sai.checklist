package br.edu.mobile.wmobile.sai.checklist.computador;

import java.util.ArrayList;
import java.util.List;

public class Programas implements IVerComputador {

	private IVerComputador anterior;

	public Programas(IVerComputador anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Programas Padrões";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Verificar se o computador está com os programas"
				+ " padrões para edição de textos, planilhas, apresentações,"
				+ " leitores de pdf, navegadores de internet.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Desinstalar o programa que não é padrão e instalar"
				+ " a versão mais atualizada do programa padrão do instituto.\n");

		return solucao;
	}

}
