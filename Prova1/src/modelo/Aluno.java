package modelo;

public class Aluno {
	///atributos
	private String nome;
	private String matricula;
	private String curso;
	
	///construtor
	public Aluno (String nomeAluno,String matriculaAluno,String cursoAluno) {
		this.nome = nomeAluno;
		this.matricula = matriculaAluno;
		this.curso = cursoAluno;
	}
	///GETs e SETs
	public String getNome() {
		return this.nome;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public String getCurso() {
		return this.curso;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setMatricula(String novaMatricula) {
		this.matricula = novaMatricula;
	}
	public void setCurso(String novoCurso) {
		this.curso = novoCurso;
	}
	public String toString() {
		return "nome do aluno é" + this.nome + "a matricula é" + this.matricula + "e cursa o curso de " + this.curso;
	}
	
	
}
