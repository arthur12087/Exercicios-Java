package modelo;

public class Funcionario {
	
	private int identificador, identificadorDoSetor, salario, RG;
	private boolean presente;
	
	public Funcionario(int ident, int identSetor, int sal, int registro, boolean presen) {
		this.identificador = ident;
		this.identificadorDoSetor = identSetor;
		this.salario = sal;
		this.RG = registro;
		this.presente = presen;
		
	}
	
	public float bonificarSalario(int aumentoSalarial) {
		 return this.salario + aumentoSalarial;
		 
	}
	
	
	public boolean demitir() {
		return this.presente = false;
		
		
	}
	

}
