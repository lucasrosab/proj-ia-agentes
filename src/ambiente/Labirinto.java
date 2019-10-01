package ambiente;

/** Classe de Construção do Labirinto
 *  @author Lucas Rosa, Novack Renato e David Lira
 * 
 */

import agente.AgenteLabirinto;
import geral.PosicaoXY;

public class Labirinto {

	private int tamanhoLabirinto;
	
	private String[][] labirinto;
	
	private AgenteLabirinto agente;
	
	/*|	Valores:
	 *|		S - Sujo
	 *|		L - Limpo
	 *|		*A* - Agente
	 *|		O - Obstáculo
	 */
	
	//Construtor passando o tamanho do labirinto
	public Labirinto(int tamanhoLabirinto) {
		this.tamanhoLabirinto = tamanhoLabirinto;
		this.construirNovoLabirinto();
	}
	
	/*|Constrói o labirinto conforme o valor da variável 'tamanhoLabirinto', 
	 *|montando uma matriz com a variável 'labirinto', coloca tambem conforme
	 *|as posições da matriz o "S" que representa "Sujo"
	 */
	private void construirNovoLabirinto() {
		labirinto = new String[this.tamanhoLabirinto][this.tamanhoLabirinto];
		for (int i = 0; i < this.tamanhoLabirinto; i++) {
			for (int j = 0; j < this.tamanhoLabirinto; j++) {
				this.labirinto[i][j] = "S";
			}
		}
	}
	
	/*|Exibe o labirinto, conforme a posição do agente, ou seja, a medida que o
	 *|agente anda um espaço é exibido uma nova visão do labirinto.
	 */
	public void exibirLabirinto() {
		atualizarPosicaoAgente(); //Trás a posição atual do agente
		for (int i = 0; i < tamanhoLabirinto; i++) {
			for (int j = 0; j < tamanhoLabirinto; j++) {
				if (labirinto[i][j].equals("*A*")) {
					System.out.print("|" + labirinto[i][j] + "|"); // |*A*|
				} else {
					System.out.print("| " + labirinto[i][j] + " |"); //
				}
				
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	/*|Pega a posição do agente e atualiza, e atualiza a medida que a posição é atualizada*/
	private void atualizarPosicaoAgente() {
		if (this.agente != null) {
			PosicaoXY posAgente = this.agente.getPosicao();
			labirinto[posAgente.getPosX()][posAgente.getPosY()] = "*A*";
		}
	}
	
	//Retorna o Tamanho do Labirinto
	public int getTamanhoLabirinto() {
		
		return this.tamanhoLabirinto;
	}
	
	//Retorna o Valor Posição do Labirinto
	public String retornarValorPosicaoLabirinto(PosicaoXY posicao) {
		return this.labirinto[posicao.getPosX()][posicao.getPosY()];
	}
	
	//Muda o Agente	
	public void setAgente(AgenteLabirinto agente) {
		this.agente = agente;
	}
	
	//Troca a posição que tiver "S" por "L"	 
	public void limpar() {
		PosicaoXY posicao = this.agente.getPosicao();
		labirinto[posicao.getPosX()][posicao.getPosY()] = "L";
	}
	
}
