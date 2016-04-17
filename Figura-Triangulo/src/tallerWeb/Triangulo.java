package tallerWeb;

public class Triangulo {
	private Double base, altura;
	
	public Triangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Double calcularArea() {
		return (base * altura) / 2;
	}
}