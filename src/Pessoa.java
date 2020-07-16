
public class Pessoa {
	private String nome;
	private static int registro;
	
	
	public Pessoa(String nome) {
		this.nome = nome;
		registro++;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
			return nome;
		}
}

