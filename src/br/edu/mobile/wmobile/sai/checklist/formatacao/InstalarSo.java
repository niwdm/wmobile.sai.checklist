package br.edu.mobile.wmobile.sai.checklist.formatacao;

import java.util.ArrayList;
import java.util.List;

public class InstalarSo implements IVerFormatacao {
	
	private IVerFormatacao anterior;

	public InstalarSo(IVerFormatacao anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Instalação Novo SO";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Seguir passos básicos da instalação do S.O..\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Informar por escrito o motivo pelo qual o S.O. não foi instalado.\n");

		return solucao;
	}

}