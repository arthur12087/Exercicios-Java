package modelo;

public class Moldura {
	
	private  Retangulo  retanguloExterno;
	private  Retangulo  retanguloInterno;
	
	public Moldura(Retangulo retExterno,Retangulo retInterno){
		 this.retanguloExterno =  retExterno;
		 this.retanguloInterno = retInterno;
	}
		 
	public float calcularAreaMoldura(){
		return (this.retanguloExterno.calcularArea() - this.retanguloInterno.calcularArea()) ;
				
		
	}
	
}
