package geral;

/** Classe do Posicionamento do agente
 *  @author Lucas Rosa, Novack Renato e David Lira
 */

public class PosicaoXY {
	
	private int posX;
	private int posY;
	
	//Construtor da Classe, com a posição já definida
	public PosicaoXY() {
		this.posX = 0;
		this.posY = 0;
	}
	
	//Construtor da Classe, passando as duas posições previamente
	public PosicaoXY(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	//Retorna a Posição X
	public int getPosX() {
		return posX;
	}
	
	//Altera o valor da Posição X
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	//Retorna a Posição Y
	public int getPosY() {
		return posY;
	}
	
	//Altera o valor da Posição X
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
}
