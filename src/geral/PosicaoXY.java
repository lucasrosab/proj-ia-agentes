package geral;

/** Classe do Posicionamento do agente
 *  @author Lucas Rosa, Novack Renato e David Lira
 */

public class PosicaoXY {
	
	private int posX;
	private int posY;
	
	//Construtor da Classe, com a posi��o j� definida
	public PosicaoXY() {
		this.posX = 0;
		this.posY = 0;
	}
	
	//Construtor da Classe, passando as duas posi��es previamente
	public PosicaoXY(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	//Retorna a Posi��o X
	public int getPosX() {
		return posX;
	}
	
	//Altera o valor da Posi��o X
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	//Retorna a Posi��o Y
	public int getPosY() {
		return posY;
	}
	
	//Altera o valor da Posi��o X
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
}
