package br.com.evo.primeiroprojeto;

import br.com.sankhya.extensions.actionbutton.AcaoRotinaJava;
import br.com.sankhya.extensions.actionbutton.ContextoAcao;

public class PrimeiroBotaoAcao  implements AcaoRotinaJava{

	@Override
	public void doAction(ContextoAcao contexto) throws Exception {

		System.out.println("PrimeiroBotaoAcao");
		
		contexto.setMensagemRetorno("Nosoo primeiro projeto");
		
	}

}
