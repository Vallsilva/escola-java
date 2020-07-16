import javax.swing.plaf.synth.SynthOptionPaneUI;

public class main {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(24, 8, "Valéria");
		Funcionario prof = new Funcionario("Professor", "Matematica", "Tereza");

		Materia aulas1 = new Materia(9.5, 10.0, 3.9);
		aulas1.setDisciplina("Português");
		
		Materia aulas2 = new Materia(9.5, 5.6, 8.0);
		aulas2.setDisciplina("Matematica");
		
		Materia aulas3 = new Materia(7.9, 8.3, 7.5);
		aulas3.setDisciplina("Geografia");
		
		Materia aulas4 = new Materia(10.0, 8.7, 2.5);
		aulas4.setDisciplina("História");
		
		Materia aulas5 = new Materia(8.4, 6.3, 2.1);
		aulas5.setDisciplina("Inglês");
		
		double media = (aulas1.getTotalNota()/3) + (aulas2.getTotalNota()/3) + (aulas3.getTotalNota()/3)
				+ (aulas4.getTotalNota()/3) + (aulas5.getTotalNota()/3);
		
		boolean resultado = (media >= 10);
		if(resultado) {
			System.out.println("O (A) Aluno(a)" + aluno.getNome());
			System.out.println("Com media" + media);
			System.out.println("Melhor nota foi na aula de " + prof.getObs());
			System.out.println("Da professora " + prof.getNome());
			System.out.println("Foi Aprovado");
		} else {
			System.out.println("O (A) Aluno(a) " + aluno.getNome());
			System.out.println("Com media " + media);
			System.out.println("Foi Reprovado");
		}
	}
}
