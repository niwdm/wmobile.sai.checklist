package br.edu.mobile.wmobile.sai.checklist.formatacao;

import java.util.ArrayList;
import java.util.List;

public class AtivarAtualizacoes implements IVerFormatacao {
	
	private IVerFormatacao anterior;

	public AtivarAtualizacoes(IVerFormatacao anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Ativar Atualizações Automáticas";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Ativar as atualizações automáticas do sistema.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Informar por escrito o motivo pelo qual as atualizações automáticas do sistema não forma ativadas.\n");

		return solucao;
	}

}