package ufpb.area.br;

public class Retangulo implements AreaCalculavel{
	
	private double base;
	private double altura;
	
	public Retangulo(double b, double a) {
		this.base = b;
		this.altura = a;
	}

	@Override
	public double CalculaArea() {
		double area = this.base*this.altura;
		return area;
	}

}
