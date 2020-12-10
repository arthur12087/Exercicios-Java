package visao;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.*;

public class Teste {

	public static void main(String[] args) {
		///contruir obj Aluno
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome do aluno: ");
		String nome = entrada.nextLine();
		System.out.println("Matrícula do aluno: ");
		String matricula = entrada.nextLine();
		System.out.println("Curso: ");
		String curso = entrada.nextLine();
						
		Aluno a = new Aluno(nome,matricula,curso);
		
		///Listas
		ArrayList<String> listaPerguntas = new ArrayList();
		ArrayList<String> listaResposta = new ArrayList();
		ArrayList<String> listaRespostaCerta = new ArrayList();
		ArrayList<Integer> listaPeso = new ArrayList();
		ArrayList<Float> listaPontMax = new ArrayList();
		
		
		///preencher as listas com valores
		for (int i=0;i<5;i++) {
			System.out.println("informe a pergunta da questão: ");
			entrada.nextLine();
			String pergunta = entrada.nextLine();
			listaPerguntas.add(pergunta);			
			System.out.println("Informe a resposta do aluno: ");
			String resposta = entrada.nextLine();
			listaResposta.add(resposta);
			System.out.println("Informe a resposta certa: ");
			String respostaC = entrada.nextLine();
			listaRespostaCerta.add(respostaC);
			System.out.println("Informe o peso dessa questão: ");
			int peso = entrada.nextInt();
			listaPeso.add(peso);
			System.out.println("Informe a pontuação máxima dessa questão(no máximo 10");
			float pontuacaoMax = entrada.nextFloat();
			listaPontMax.add(pontuacaoMax);
					
		}	
			Prova p = new Prova(a,listaPeso,listaRespostaCerta,listaPerguntas,listaResposta,listaPontMax);
			/// só consegui até aqui :(
			
			
		}

}