package br.edu.mobile.wmobile.sai.checklist.formatacao;

import java.util.ArrayList;
import java.util.List;

public class InstalarImpressoras implements IVerFormatacao {
	
	private IVerFormatacao anterior;

	public InstalarImpressoras(IVerFormatacao anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Instalar Impressoras";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Instalar driver de impressoras que o usuário do desktop necessita.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Informar por escrito o motivo pelo qual os drivers de impressoras não forma instalados.\n");

		return solucao;
	}

}