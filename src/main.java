
public class main {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		String nome = "Valéria"; 
		aluno.setPessoa(nome);
		int idade = 24;
		aluno.setIdade(idade);

		Materia aulas1 = new Materia(9.5, 10.0, 3.9);
		aulas1.setMateria("Português");
		
		Materia aulas2 = new Materia(9.5, 5.6, 8.0);
		aulas2.setMateria("Matematica");
		
		Materia aulas3 = new Materia(7.9, 8.3, 7.5);
		aulas3.setMateria("Geografia");
		
		Materia aulas4 = new Materia(10.0, 8.7, 2.5);
		aulas4.setMateria("História");
		
		Materia aulas5 = new Materia(8.4, 6.3, 2.1);
		aulas5.setMateria("Inglês");
		
		double media = (aulas1.getTotalNota()/3) + (aulas2.getTotalNota()/3) + (aulas3.getTotalNota()/3)
				+ (aulas4.getTotalNota()/3) + (aulas5.getTotalNota()/3);
		
		boolean resultado = (media >= 50);
		if(resultado) {
			System.out.println("O (A) Aluno(a)" + aluno.getPessoa());
			System.out.println("Com media" + media);
			System.out.println("Foi Aprovado");
		} else {
			System.out.println("O (A) Aluno(a) " + aluno.getPessoa());
			System.out.println("Com media " + media);
			System.out.println("Foi Reprovado");
		}
	}
}
