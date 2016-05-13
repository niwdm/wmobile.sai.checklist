package br.edu.mobile.wmobile.sai.checklist.formatacao;

import java.util.ArrayList;
import java.util.List;

public class InstalarProgramas implements IVerFormatacao {
	
	private IVerFormatacao anterior;

	public InstalarProgramas(IVerFormatacao anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Instalar Programas Padrões";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Instalar programas padrões necessários ao usuário.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Informar por escrito o motivo pelo qual os programas padrões não foram instalados.\n");

		return solucao;
	}

}