package ufpb.Movable.br;

public class MovablePoint implements Movable{
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	//INICIALIZANDO
	public MovablePoint(int x,int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		
	}
	
	@Override
	public String toString() {
		return "(X,Y) = ("+this.x+","+this.y+")"+" |(xSpeed,ySpeed) = ("+this.xSpeed+","+this.ySpeed+")";
	}
	//MOVER PARA CIMA
	@Override
	public void moveUp() {
		this.y += ySpeed;
		
	}
	
	//MOVER PARA BAIXO
	@Override
	public void moveDown() {
		this.y -= ySpeed;
		
	}

	//MOVER PARA ESQUERDA
	@Override
	public void moveLeft() {
		this.x -= xSpeed;
		
	}

	//MOVER PARA DIREITA
	@Override
	public void moveRight() {
		this.x += xSpeed;
		
	}

}
