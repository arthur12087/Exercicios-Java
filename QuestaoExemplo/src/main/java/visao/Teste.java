
package visao;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Circulo;
import modelo.Quadrado;
import modelo.Retangulo;

public class Teste {
    public static void main(String args[]){
        ArrayList listaFormas = new ArrayList();
        
       Scanner entrada = new Scanner(System.in);
        System.out.println("informe qual forma deseja criar(Q,R ou C)");
        String opcao = entrada.nextLine();
        
        if ("R".equals(opcao)){
            System.out.println("Digite a base do retangulo:");
            float base = entrada.nextFloat();
            System.out.println("Digite a altura do retangulo:");
            float altura = entrada.nextFloat();
            
            Retangulo ret = new Retangulo(base,altura);
            listaFormas.add(ret);
            System.out.println("Retangulo de altura " + ret.getAltura()+ " e base de " + ret.getBase());
            System.out.println("perimetro de " + ret.calcularPerimetro());
            System.out.println("area de " + ret.calcularArea());
            
        }
        if ("Q".equals(opcao)){
            System.out.println("digite um lado do quadrado");
            float lado = entrada.nextFloat();
            
            Quadrado quad = new Quadrado(lado);
            listaFormas.add(quad);
            System.out.println("lados de " + quad.getLado());
            System.out.println("perimetro de " + quad.calcularPerimetro());
            System.out.println("area de " + quad.calcularArea());
        }
        if ("C".equals(opcao)){
            System.out.println("digite o raio do circulo:");
            float raio = entrada.nextFloat();
            
            Circulo circ = new Circulo(raio);
            listaFormas.add(circ);
            System.out.println("raio de " + circ.getRaio());
            System.out.println("perimetro de " + circ.calcularPerimetro());
            System.out.println("area de " + circ.calcularArea());
           
        }
           
        
                                                  
        
       }      
        
        
    
}
