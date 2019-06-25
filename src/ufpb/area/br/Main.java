package ufpb.area.br;

public class Main {

	private AreaCalculavel [] formasGeometricas = new AreaCalculavel[3];
	
	public void CriarFormasG () {
		
		this.formasGeometricas[0] = new Quadrado(7);
		this.formasGeometricas[1] = new Retangulo(2,4);
		this.formasGeometricas[2] = new Circulo(3);
		
	}
	
	public void CalcularAreasF() {
		for(AreaCalculavel a: this.formasGeometricas) {
			System.out.println("Área da Figura = " + a.CalculaArea());
		}
	}
	
	public static void main(String[] args) {
		
		Main a = new Main();
		a.CriarFormasG();
		a.CalcularAreasF();
		
	}
}
