
public class Equacao2grau {
	
	public static void main(String [] args) {
		
		double a=2, b=5, c=2;
		
		double delta = (b*b) - (4*a*c);
		double x1 = -1 * -b + Math.sqrt(delta) / (2*a);
		double x2 = -1 * -b - Math.sqrt(delta) / (2*a);
		
		System.out.println("o resultado x linha é " + x1 + " e o resultado x duas linhas é " + x2);
		
		
	}
	
	

}
