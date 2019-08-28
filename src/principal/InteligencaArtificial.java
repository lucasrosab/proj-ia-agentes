package principal;

import agente.AgenteLabirinto;
import ambiente.Labirinto;
import geral.PosicaoXY;

public class InteligencaArtificial {

	public static void main(String[] args) throws InterruptedException	 {
		
		Labirinto labirinto = new Labirinto(6);	
		labirinto.exibirLabirinto();
		
		AgenteLabirinto agente = new AgenteLabirinto(labirinto);
		agente.setPosicao(new PosicaoXY());

		while(agente.isAindaLimpando()) {
			agente.zerarPilha();
			agente.movimentar(); 
			labirinto.exibirLabirinto();
			Thread.sleep(1500);
		}
		return;
	}

}
