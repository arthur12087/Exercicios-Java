
package modelo;


public class Retangulo extends Quadrilateros{
    private float base;
    private float altura;

    public Retangulo() {}
    

    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    
    public float calcularPerimetro() {
        return 2*(this.base) + 2*(this.altura);
    }
    
    public float calcularArea(){
        return this.base * this.altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    
    
}
