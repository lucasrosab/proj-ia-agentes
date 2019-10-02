package ambiente;

import agente.AgenteLabirinto;
import java.util.Random;
import geral.PosicaoXY;

public class Labirinto {

	private int tamanhoLabirinto;
	
	private String[][] labirinto;
	
	private AgenteLabirinto agente;
	
	/* Valores
	 * S - Sujo
	 * L - Limpo
	 * *A* - Agente
	 * O - Obstáculo
	 */
	
	public Labirinto(int tamanhoLabirinto) {
		this.tamanhoLabirinto = tamanhoLabirinto;
		this.construirNovoLabirinto();
	}
	
	// Construir o labirinto// Neste metodo foi inserido a funcionalidade de criar o obstaculo dentro do labirinto utilizando 
	// O Random..
	private void construirNovoLabirinto() {			
		labirinto = new String[this.tamanhoLabirinto][this.tamanhoLabirinto];
		for (int i = 0; i < this.tamanhoLabirinto; i++) {
			for (int j = 0; j < this.tamanhoLabirinto; j++) {
				this.labirinto[i][j] = "S";		
				Random obstaculo = new Random();
				int x = obstaculo.nextInt(2);
				if(x==1) {
					i = obstaculo.nextInt(this.getTamanhoLabirinto()-1);
					j = obstaculo.nextInt(this.getTamanhoLabirinto()-1);
					this.labirinto[i][j] = "O";
				}
			}
		}
	}
	
	public void exibirLabirinto() {
		atualizarPosicaoAgente();
		for (int i = 0; i < tamanhoLabirinto; i++) {
			for (int j = 0; j < tamanhoLabirinto; j++) {
				if (labirinto[i][j].equals("*A*")) {
					System.out.print("|" + labirinto[i][j] + "|");
				} else {
					System.out.print("| " + labirinto[i][j] + " |");
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}

	private void atualizarPosicaoAgente() {
		if (this.agente != null) {
			PosicaoXY posAgente = this.agente.getPosicao();
			labirinto[posAgente.getPosX()][posAgente.getPosY()] = "*A*";
		}
	}

	public int getTamanhoLabirinto() {
		
		return this.tamanhoLabirinto;
	}

	public String retornarValorPosicaoLabirinto(PosicaoXY posicao) {
		return this.labirinto[posicao.getPosX()][posicao.getPosY()];
	}

	public void setAgente(AgenteLabirinto agente) {
		this.agente = agente;
	}

	public void limpar() {
		PosicaoXY posicao = this.agente.getPosicao();
		labirinto[posicao.getPosX()][posicao.getPosY()] = "L";
	}
	
}
