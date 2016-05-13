package br.edu.mobile.wmobile.sai.checklist.formatacao;

import java.util.ArrayList;
import java.util.List;

public class Backup implements IVerFormatacao {

	@Override
	public String getNome() {
		return "Backup Arquivos";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Copiar arquivos pessoais do usuário.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Informar por escrito o motivo pelo qual não foi feito o backup.\n");

		return solucao;
	}

}