package br.com.evo.primeiroprojeto;

import br.com.sankhya.extensions.actionbutton.AcaoRotinaJava;
import br.com.sankhya.extensions.actionbutton.ContextoAcao;
import br.com.sankhya.extensions.actionbutton.Registro;
import br.com.sankhya.modelcore.dwfdata.listeners.tsi.AcaoAgendadaListener;

public class LancamentoCabecalhoBT implements AcaoRotinaJava{

	@Override
	public void doAction(ContextoAcao contexto) throws Exception {
	
		System.out.println("LancamentoCabecalhoBT - Inicio");
		
		//como incluir um valor no sankhya
		Registro cabecalho = contexto.novaLinha("AD_DANDTTESTE");
		cabecalho.setCampo("CODCUR", 1);
		cabecalho.setCampo("DTINICIO", "01/01/2025");
		cabecalho.setCampo("DTFIM", "05/01/2025");
		cabecalho.setCampo("CODUSU", contexto.getUsuarioLogado());
		cabecalho.setCampo("CODPARC", 22);
		cabecalho.save();		
		
		
	
		System.out.println("LancamentoCabecalhoBT - Fim");
		
	}

}
