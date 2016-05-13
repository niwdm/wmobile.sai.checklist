package br.edu.mobile.wmobile.sai.checklist.computador;

import java.util.ArrayList;
import java.util.List;

public class Energia implements IVerComputador {

	@Override
	public String getNome() {
		return "Energia";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Verificar se o computador está ligado" +
		" à fonte de energias seguras e ininterruptas para " +
		"proteger o computador.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Providenciar estabilizador, cabos ou"+
				" informar ao setor de manutenção problemas"+
				" na rede elétrica.\n");

		return solucao;
	}

}
