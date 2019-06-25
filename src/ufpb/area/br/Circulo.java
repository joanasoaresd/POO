package ufpb.area.br;

public class Circulo implements AreaCalculavel{
	
	private double raio;
	
	public Circulo(double r) {
		this.raio = r;
	}

	@Override
	public double CalculaArea() {
		double pi = 3.14;
		double area = pi*(this.raio*this.raio);
		return area;
	}
	
	

}
