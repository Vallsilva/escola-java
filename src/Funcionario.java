
public class Funcionario extends Pessoa {
	private String cargo;
	private String obs;
	
	public Funcionario(String cargo, String materia, String nome) {
		super(nome);
		this.cargo = cargo;
		this.obs = materia;
	}
	public String getCargo() {
		return cargo;
	}
	
	public String getObs() {
		return obs;
	}
}
	
	