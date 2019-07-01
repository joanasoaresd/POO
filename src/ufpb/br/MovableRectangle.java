package ufpb.br;

public class MovableRectangle implements Movable{
	private MovablePoint cSuperiorEsquerdo;
	private MovablePoint cInferiorDireito;
	
	public MovableRectangle(int x, int y, int xSpeed, int ySpeed){
		cSuperiorEsquerdo = new MovablePoint(x,y,xSpeed,ySpeed);
		cInferiorDireito = new MovablePoint(x,y,xSpeed,ySpeed);
		
	}
	
	public String toString() {
		return "";
	}
	
	@Override
	public void moveUp() {
		this.cSuperiorEsquerdo.y += this.cSuperiorEsquerdo.ySpeed;
		this.cInferiorDireito.y += this.cInferiorDireito.ySpeed;
		
	}
	@Override
	public void moveDown() {
		this.cInferiorDireito.y -= this.cInferiorDireito.ySpeed;
		this.cSuperiorEsquerdo.y -= this.cSuperiorEsquerdo.ySpeed;
		
	}
	@Override
	public void moveLeft() {
		this.cInferiorDireito.x -= this.cInferiorDireito.xSpeed;
		this.cSuperiorEsquerdo.x -= this.cSuperiorEsquerdo.xSpeed;
		
	}
	@Override
	public void moveRight() {
		this.cInferiorDireito.x += this.cInferiorDireito.xSpeed;
		this.cSuperiorEsquerdo.x += this.cSuperiorEsquerdo.xSpeed;
		
	}

}
