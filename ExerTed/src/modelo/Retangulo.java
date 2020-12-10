package modelo;

public class Retangulo {
	
	private float base;
	private float altura;
	
	public Retangulo(float b, float a){
		this.base =b;
		this.altura=a;
	}
		
	public float calcularArea() {
		return this.base * this.altura;
		
		
		
	}
	
	

}
