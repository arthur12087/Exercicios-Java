
package modelo;


public class Circulo implements IFormaGeometrica {
    private float raio;
    
    
    public Circulo(){}
    
    public Circulo(float raio){
        this.raio = raio;
    }
    
    public float calcularPerimetro(){
        return 2*(3.14f) *this.raio;
    }
    
    public float calcularArea(){
        return 3.14f * (this.raio * this.raio);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
}
