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
		return "Programas Padr�es";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Verificar se o computador est� com os programas"
				+ " padr�es para edi��o de textos, planilhas, apresenta��es,"
				+ " leitores de pdf, navegadores de internet.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Desinstalar o programa que n�o � padr�o e instalar"
				+ " a vers�o mais atualizada do programa padr�o do instituto.\n");

		return solucao;
	}

}
