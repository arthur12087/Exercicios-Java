
package modelo;


public class Quadrado extends Quadrilateros{
    private float lado;
    
    public Quadrado() {}
    
    public Quadrado(float lado){
        this.lado =lado;
    }
    
    public float calcularPerimetro(){
        return 4*(this.lado);
    }
    public float calcularArea(){
        return this.lado * this.lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    
  
    
}
