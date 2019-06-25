package ufpb.area.br;

public class Quadrado implements AreaCalculavel {

	private double lado;
	
	public Quadrado(double l) {
		this.lado = l;
	}
	
	@Override
	public double CalculaArea() {
		double area = this.lado * this.lado;
		return area;
	}

}
