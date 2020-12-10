
package visao;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Turma;


public class Teste {
    public static void main(String args[]){
        ArrayList listaDeAtletas = new ArrayList();
        listaDeAtletas.add("Marcelo Dantas " + "Yuri Araujo " + "Victor Irineu ");
        String nomeDaTurma = "9A";
        String modalidade = "Treino Aquático";
        String nomeDoProfessor = "Jorge Jesus";
        String horarioSemanal = "18 as 20";
        
        ///Também é possível construir os objetos atleta,professor e adicionar para construir a turma
        
        Turma turma1 = new Turma(listaDeAtletas,nomeDaTurma,modalidade,nomeDoProfessor,horarioSemanal);
        System.out.println(turma1);
         
        
    }
    
    
}
