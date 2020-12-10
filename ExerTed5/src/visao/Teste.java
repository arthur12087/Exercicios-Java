package visao;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Conta;

public class Teste {

	public static void main(String[] args) {
		
		
		ArrayList lista = new ArrayList();
		
		for (int i=0;i<4;i++) {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o número da conta:");
			int numConta = entrada.nextInt();
			System.out.println("Digite o saldo de sua conta:");
			double saldoConta = entrada.nextInt();
			
			Conta c = new Conta(numConta,saldoConta);
			lista.add(c);
		
	
		
		}
		
	}

}
