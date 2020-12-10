
package modelo;


public class Professor extends PessoaClube {
    private String nomeDoProfessor;
    
     

    public Professor(String nomeDoProfessor, float identificador) {
        super(identificador);
        this.nomeDoProfessor = nomeDoProfessor;
    }
    

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    
    public String toString() {
        return "Professor{" + "nomeDoProfessor=" + nomeDoProfessor + "Identificação=" + getIdentificador() + '}';
    }

    
    
}
