
public class Aluno {
	private String nome;
	private static int matricula;
	private int idade;

	public Aluno() {
		matricula++;
	}

	public void setAluno(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getAluno() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
}