package br.edu.mobile.wmobile.sai.checklist.computador;

import java.util.ArrayList;
import java.util.List;

public class Impressoras implements IVerComputador {

	private IVerComputador anterior;

	public Impressoras(IVerComputador anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Impressoras";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Verificar se as impressoras que o usu�rio necessita est�o instaladas.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Instalar os drivers da impressora que o usu�rio necessita.\n");

		return solucao;
	}

}
