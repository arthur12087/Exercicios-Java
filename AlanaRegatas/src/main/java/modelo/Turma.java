
package modelo;
import java.util.ArrayList;


public class Turma {
    private ArrayList listaAtletas;
    private String nomeTurma;
    private String modalidade;
    private String nomeProfessor;
    private String horarioSemanal;
    
    public Turma(){}

    public Turma(ArrayList listaAtletas, String nomeTurma, String modalidade, String nomeProfessor, String horarioSemanal) {
        this.listaAtletas = listaAtletas;
        this.nomeTurma = nomeTurma;
        this.modalidade = modalidade;
        this.nomeProfessor = nomeProfessor;
        this.horarioSemanal = horarioSemanal;
    }

    public ArrayList getListaAtletas() {
        return listaAtletas;
    }

    public void setListaAtletas(ArrayList listaAtletas) {
        this.listaAtletas = listaAtletas;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getHorarioSemanal() {
        return horarioSemanal;
    }

    public void setHorarioSemanal(String horarioSemanal) {
        this.horarioSemanal = horarioSemanal;
    }
    
    

   public ArrayList adicionarAtleta(String novoAluno){
       
    this.listaAtletas.add(novoAluno);
    return this.listaAtletas;
       
   }

    
    public String toString() {
        return "Turma{" + "listaAtletas=" + listaAtletas + ", nomeTurma=" + nomeTurma + ", modalidade=" + modalidade + ", nomeProfessor=" + nomeProfessor + ", horarioSemanal=" + horarioSemanal + '}';
    }

   
    
    
        
}
