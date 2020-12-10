package modelo;

public class Prova {
	
	///atributos
	private int idProva;	
	private int pesos[] = new int[5];
	private float pontuacaoMaxQuestao[] = new float[5];
	private String respostaCerta[] = new String[5];
	private String perguntas[]= new String[5];
	private String respostas[][]= new String[5][5];
	private Aluno aluno ;
	
	///construtor
	public Prova() {
	}
	
	public Prova(Aluno aluno,int[] pesos,String[] respostaC,String[] perguntas,String[][] respostas,float[] pontuacao) {
		this.aluno = aluno;
		this.pesos = pesos;
		this.respostaCerta = respostaC;
		this.perguntas = perguntas;
		this.respostas = respostas;
		this.pontuacaoMaxQuestao = pontuacao;
				
		
	}
	///métodos
	public  float calcularNota() {		
		
		return (this.pesos[0] * this.pontuacaoMaxQuestao[0]) / this.pesos[0];
	}
	///toString
	public String toString() {
		return "dados do aluno: " + this.aluno + "sua média é ";
	}
	///GETs e SETs

	public int getIdProva() {
		return idProva;
	}

	public void setIdProva(int idProva) {
		this.idProva = idProva;
	}

	public int[] getPesos() {
		return pesos;
	}

	public void setPesos(int[] pesos) {
		this.pesos = pesos;
	}

	public float[] getPontuacaoMaxQuestao() {
		return pontuacaoMaxQuestao;
	}

	public void setPontuacaoMaxQuestao(float[] pontuacaoMaxQuestao) {
		this.pontuacaoMaxQuestao = pontuacaoMaxQuestao;
	}

	public String[] getRespostaCerta() {
		return respostaCerta;
	}

	public void setRespostaCerta(String[] respostaCerta) {
		this.respostaCerta = respostaCerta;
	}

	public String[] getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(String[] perguntas) {
		this.perguntas = perguntas;
	}

	public String[][] getRespostas() {
		return respostas;
	}

	public void setRespostas(String[][] respostas) {
		this.respostas = respostas;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	
	
}
