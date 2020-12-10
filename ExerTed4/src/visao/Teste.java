package visao;

import java.util.Scanner;
import modelo.Funcionario;

public class Teste {
	
	public static void main(String[]args){
		for (int i=0;i<5;i++) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\ndigite o numero de identificação: ");
		int identificação = entrada.nextInt();
		System.out.println("digite a identificação de setor: ");
		int identificaçãoSetor = entrada.nextInt();
		System.out.println("digite o valor do salário: ");
		int salario = entrada.nextInt();
		System.out.println("digite o RG: ");
		int RG = entrada.nextInt();
		System.out.println("O funcionário ainda está na empresa? ");
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
		
		Funcionario func = new Funcionario(identificação,identificaçãoSetor,salario,RG,funcionarioPresente);
		
		if (respostaSalario.equals("sim")) {
			System.out.println("digite o aumento que deseja para o salario:");
			int aumentoSalario = entrada.nextInt();
			System.out.println("O salario deste funcionario agora é " + func.bonificarSalario(aumentoSalario) );			
			
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
