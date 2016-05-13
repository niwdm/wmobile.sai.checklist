package br.edu.mobile.wmobile.sai.checklist.formatacao;

import java.util.ArrayList;
import java.util.List;

public class RestaurarBackup implements IVerFormatacao {
	
	private IVerFormatacao anterior;

	public RestaurarBackup(IVerFormatacao anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Restaurar Backup";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Caso tenha realizado backup, fazer a restauração dos arquivos.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add(
				"Caso tenha realizado backup antes da formatação,"+
		" informar por escrito o motivo pelo qual não conseguiu restaurar os arquivos de backup.\n");

		return solucao;
	}

}