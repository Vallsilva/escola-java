
public class Materia {
	private String disciplina;
	private double prova1;
	private double prova2;
	private double prova3;
	private double totalnota;
	
	public Materia(double prova1, double prova2, double prova3) {
		this.prova1= prova1;
		this.prova2 = prova2;
		this.prova3 = prova3;
		this.totalnota = prova1+prova2+prova3;
	}
	
	public void setMateria(String materia) {
		this.disciplina = materia;
	}

	public String getMateria() {
		return disciplina;
	}
	public double getTotalNota() {
		return totalnota;
	}
}
