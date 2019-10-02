package principal;

import agente.AgenteLabirinto;
import ambiente.Labirinto;
import geral.PosicaoXY;

public class InteligencaArtificial {

	public static void main(String[] args) throws InterruptedException	 {
		
		Labirinto labirinto = new Labirinto(5);	
		labirinto.exibirLabirinto();
		
		AgenteLabirinto agente = new AgenteLabirinto(labirinto);
		agente.setPosicao(new PosicaoXY(0,0));

		while(agente.isAindaLimpando()) {
			agente.zerarPilha();
			agente.movimentar(); 
			labirinto.exibirLabirinto();
			Thread.sleep(1500);
		}
		return;
	}

}
