package br.edu.mobile.wmobile.sai.checklist;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.mobile.wmobile.sai.checklist.computador.Antivirus;
import br.edu.mobile.wmobile.sai.checklist.computador.Atualizacoes;
import br.edu.mobile.wmobile.sai.checklist.computador.Energia;
import br.edu.mobile.wmobile.sai.checklist.computador.IVerComputador;
import br.edu.mobile.wmobile.sai.checklist.computador.Impressoras;
import br.edu.mobile.wmobile.sai.checklist.computador.Programas;
import br.edu.mobile.wmobile.sai.checklist.computador.ProtecaoSenha;
import br.edu.mobile.wmobile.sai.checklist.formatacao.AtivarAtualizacoes;
import br.edu.mobile.wmobile.sai.checklist.formatacao.Backup;
import br.edu.mobile.wmobile.sai.checklist.formatacao.IVerFormatacao;
import br.edu.mobile.wmobile.sai.checklist.formatacao.InstalarAntivirus;
import br.edu.mobile.wmobile.sai.checklist.formatacao.InstalarImpressoras;
import br.edu.mobile.wmobile.sai.checklist.formatacao.InstalarProgramas;
import br.edu.mobile.wmobile.sai.checklist.formatacao.InstalarSo;
import br.edu.mobile.wmobile.sai.checklist.formatacao.Particionamento;
import br.edu.mobile.wmobile.sai.checklist.formatacao.RestaurarBackup;

@ManagedBean(name = "check")
@SessionScoped
public class Checklist {

	private String email = "";

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	private String senha = "";

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	private String solucaoGeral = "";

	private static List<IVerComputador> itemComputador = new ArrayList<IVerComputador>();

	private static List<IVerFormatacao> itemFormatacao = new ArrayList<IVerFormatacao>();

	static {
		IVerComputador verific = new Energia();
		itemComputador.add(verific);

		verific = new ProtecaoSenha(verific);
		itemComputador.add(verific);

		verific = new Antivirus(verific);
		itemComputador.add(verific);

		verific = new Programas(verific);
		itemComputador.add(verific);

		verific = new Impressoras(verific);
		itemComputador.add(verific);

		verific = new Atualizacoes(verific);
		itemComputador.add(verific);

		IVerFormatacao verificformat = new Backup();
		itemFormatacao.add(verificformat);

		verificformat = new Particionamento(verificformat);
		itemFormatacao.add(verificformat);

		verificformat = new InstalarSo(verificformat);
		itemFormatacao.add(verificformat);

		verificformat = new InstalarAntivirus(verificformat);
		itemFormatacao.add(verificformat);

		verificformat = new InstalarProgramas(verificformat);
		itemFormatacao.add(verificformat);

		verificformat = new InstalarImpressoras(verificformat);
		itemFormatacao.add(verificformat);

		verificformat = new AtivarAtualizacoes(verificformat);
		itemFormatacao.add(verificformat);

		verificformat = new RestaurarBackup(verificformat);
		itemFormatacao.add(verificformat);
	}

	public IVerComputador getVerComputador(int numero) {
		return itemComputador.get(numero - 1);
	}

	public IVerFormatacao getVerFormatacao(int numero) {
		return itemFormatacao.get(numero - 1);
	}

	public int getTotalVerComputador() {
		return itemComputador.size();
	}

	public int getTotalVerFormatacao() {
		return itemFormatacao.size();
	}

	public String getSolucaoGeral() {
		String solut = "";
		solut = solucaoGeral;
		if (solucaoGeral.equals("")) {
			return "N�o foram encontrados problemas! Checklist finalizado!";
		}
		setLimparSolucaoGeral();
		return solut;
	}

	public void setSolucaoGeral(String solucaoGeral) {
		this.solucaoGeral = solucaoGeral;
	}

	public void setLimparSolucaoGeral() {
		this.solucaoGeral = "";
	}
	
	public void selecionarComputador(int numero) {
		System.out.println("Selecionado " + getVerComputador(numero).getNome());
		solucaoGeral = solucaoGeral + getVerComputador(numero).getSolucao();
	}

	public void selecionarFormatacao(int numero) {
		System.out.println("Selecionado " + getVerFormatacao(numero).getNome());
		solucaoGeral = solucaoGeral + getVerFormatacao(numero).getSolucao();
	}

}
