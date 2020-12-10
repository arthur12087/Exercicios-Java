
package modelo;


public class Atleta extends PessoaClube {
    private String nomeDoAtleta;
    
    
   

    public Atleta(String nomeDoAtleta, float identificador) {
        super(identificador);
        this.nomeDoAtleta = nomeDoAtleta;
    }

    public String getNomeDoAtleta() {
        return nomeDoAtleta;
    }

    public void setNomeDoAtleta(String nomeDoAtleta) {
        this.nomeDoAtleta = nomeDoAtleta;
    }

    
    public String toString() {
        return "Atleta{" + "nomeDoAtleta=" + nomeDoAtleta + "Identificação =" + getIdentificador() + '}';
    }
    
    
    
    
    
}
