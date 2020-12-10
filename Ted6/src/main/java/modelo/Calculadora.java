
package modelo;

public class Calculadora {
    ///Atributos
    private float multiplicante;
    private float multiplicador;
    
    ///Construtores
public Calculadora(float multiplicante,float multiplicador){
    this.multiplicante = multiplicante;
    this.multiplicador = multiplicador;
    
}
///Métodos
    public double somar(){
        return this.multiplicante + this.multiplicador;
    }
    public double subtrair(){
        return this.multiplicante - this.multiplicador;
    }
    public double multiplicar(){
        return this.multiplicante * this.multiplicador;
    }
    public double dividir(){
        return this.multiplicante / this.multiplicador;
    }
    
    

///GETs SETs

    public float getMultiplicante() {
        return multiplicante;
    }

    public void setMultiplicante(float multiplicante) {
        this.multiplicante = multiplicante;
    }

    public float getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(float multiplicador) {
        this.multiplicador = multiplicador;
    }



}
