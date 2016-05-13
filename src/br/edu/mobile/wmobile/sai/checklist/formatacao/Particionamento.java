package br.edu.mobile.wmobile.sai.checklist.formatacao;

import java.util.ArrayList;
import java.util.List;

public class Particionamento implements IVerFormatacao {
	
	private IVerFormatacao anterior;

	public Particionamento(IVerFormatacao anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getNome() {
		return "Particionamento do Disco";
	}

	@Override
	public List<String> getInformacao() {
		List<String> informacao = new ArrayList<String>();
		informacao.add("Particionar o disco com as necessidades do desktop. Verificar se o desktop terá dual boot.\n");

		return informacao;
	}

	@Override
	public List<String> getSolucao() {
		List<String> solucao = new ArrayList<String>();
		solucao.add("Particonamento de forma automática pela instalação do S.O..\n");

		return solucao;
	}

}