
public class Exercicio {

	public static void main(String [] args) {
		
		float salHora=15, horaTrab=120;
		float salBruto;
		salBruto = salHora * horaTrab;
		
		double impostoRenda = salBruto *0.11;
		double impostoINSS = salBruto *0.08;
		double impostoSindicato = salBruto * 0.05;
		
		double valorDescontado = impostoRenda + impostoINSS + impostoSindicato;
		double salLiquido = salBruto - valorDescontado;
		
		
		System.out.println("seu salario bruto � de "+salBruto);
		System.out.println("o imposto de renda � "+impostoRenda);
		System.out.println("o imposto do INSS � "+impostoINSS);
		System.out.println("o imposto do sindicato � "+impostoSindicato);
		System.out.println("o salario liquido � de "+ salLiquido);
		System.out.println("o valor descontado dos impostos � de " + valorDescontado);
		
		
		
		
	}
	
}
