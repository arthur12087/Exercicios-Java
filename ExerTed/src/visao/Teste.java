package visao;
import java.util.Scanner;

import modelo.Moldura;
import modelo.Retangulo;

public class Teste {
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o da altura externa: ");
		float alturaExterna = entrada.nextFloat();
		System.out.println("digite o valor da base externa: ");
		float baseExterna = entrada.nextFloat();
		System.out.println("digite o valor da altura interna: ");
		float alturaInterna = entrada.nextFloat();
		System.out.println("digite o valor da base interna:");
		float baseInterna = entrada.nextFloat();
		
		entrada.close();
		
		Retangulo externo = new Retangulo(alturaExterna,baseExterna);
		Retangulo interno = new Retangulo(alturaInterna,baseInterna);
		
		Moldura m = new Moldura(externo,interno);
		System.out.println("A área da moldura é "+ m.calcularAreaMoldura());
		
		
	}
	

}
