
public class Aluno extends Pessoa {

	private int idade;
	private int serie;
	
	public Aluno(int idade, int serie, String nome) {
		super(nome);
		this.idade = idade;
		this.serie = serie;
	}

	public int getIdade() {
		return idade;
	}
}