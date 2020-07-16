
public class Pessoa {
	private String nome;
	private static int registro;
	
	
	public Pessoa() {
		registro++;
	}
	public void setPessoa(String nome) {
		this.nome = nome;
	}
	public String getPessoa() {
			return nome;
		}
}

