package visao;

import java.util.Scanner;
import modelo.Funcionario;

public class Teste {
	
	public static void main(String[]args){
		for (int i=0;i<5;i++) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\ndigite o numero de identifica��o: ");
		int identifica��o = entrada.nextInt();
		System.out.println("digite a identifica��o de setor: ");
		int identifica��oSetor = entrada.nextInt();
		System.out.println("digite o valor do sal�rio: ");
		int salario = entrada.nextInt();
		System.out.println("digite o RG: ");
		int RG = entrada.nextInt();
		System.out.println("O funcion�rio ainda est� na empresa? ");
		entrada.nextLine();
		String resposta = entrada.nextLine();
		
				
		boolean funcionarioPresente = (resposta.equals( "sim"));
		
		if (funcionarioPresente == false) {
			 funcionarioPresente = false;
			 return;
			 
		} 		
		else {
			funcionarioPresente = true;			
		}
										
		
		
		System.out.println("deseja bonificar o salario deste funcionario? ");
		String respostaSalario = entrada.nextLine();
		
		Funcionario func = new Funcionario(identifica��o,identifica��oSetor,salario,RG,funcionarioPresente);
		
		if (respostaSalario.equals("sim")) {
			System.out.println("digite o aumento que deseja para o salario:");
			int aumentoSalario = entrada.nextInt();
			System.out.println("O salario deste funcionario agora � " + func.bonificarSalario(aumentoSalario) );			
			
		} else {
			System.out.println("ok,sem aumento!");
		}
		
		System.out.print("Deseja demitir este funcionario?");
		entrada.nextLine();
		String demissao = entrada.nextLine();
		
		if (demissao.equals( "sim")) {
			System.out.print("funcionario demitido!");
			func.demitir();
			
		} else {
			System.out.println("Fim");
		}
		
		
	}
		
	}
}
