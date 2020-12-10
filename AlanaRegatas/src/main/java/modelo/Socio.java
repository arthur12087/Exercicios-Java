
package modelo;


public class Socio extends PessoaClube {
    private String nomeDoSocio;
    private float quantiaMensal;

    public Socio(String nomeDoSocio, float quantiaMensal ,float identificador) {
        super(identificador);
        this.nomeDoSocio = nomeDoSocio;
        this.quantiaMensal = quantiaMensal;
    }

    public String getNomeDoSocio() {
        return nomeDoSocio;
    }

    public void setNomeDoSocio(String nomeDoSocio) {
        this.nomeDoSocio = nomeDoSocio;
    }

    public float getQuantiaMensal() {
        return quantiaMensal;
    }

    public void setQuantiaMensal(float quantiaMensal) {
        this.quantiaMensal = quantiaMensal;
    }

    
    
    
    
    
}
