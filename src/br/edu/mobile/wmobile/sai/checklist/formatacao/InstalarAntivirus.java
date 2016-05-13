package br.edu.mobile.wmobile.sai.checklist.formatacao;

import java.util.ArrayList;
import java.util.List;

public class InstalarAntivirus implements IVerFormatacao {
	
	private IVerFormatacao anterior;

	public InstalarAntivirus(IVerFormatacao anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Instalar Antiv�rus";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Instalar solu��o padr�o de antiv�rus e atualizar base de vacinas.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Informar por escrito o motivo pelo qual a base de vacinas n�o foi atualizada.\n");

		return solucao;
	}

}