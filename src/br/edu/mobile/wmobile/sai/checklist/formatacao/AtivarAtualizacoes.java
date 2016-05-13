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
		return "Ativar Atualiza��es Autom�ticas";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Ativar as atualiza��es autom�ticas do sistema.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Informar por escrito o motivo pelo qual as atualiza��es autom�ticas do sistema n�o forma ativadas.\n");

		return solucao;
	}

}