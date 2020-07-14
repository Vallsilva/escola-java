
public class main {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		String nome = "Valéria"; 
		aluno.setAluno(nome);
		int idade = 24;
		aluno.setIdade(idade);
		
		Materia aulas1 = new Materia();
		String materia1 = "Português";
		aulas1.setMateria(materia1);
		aulas1.setNota(9.5);
		double nota1 = aulas1.getNota();
		
		Materia aulas2 = new Materia();
		String materia2 = "Matematica";
		aulas2.setMateria(materia2);
		aulas2.setNota(8.5);
		double nota2 = aulas2.getNota();
		
		Materia aulas3 = new Materia();
		String materia3 = "Geografia";
		aulas3.setMateria(materia3);
		aulas3.setNota(9.0);
		double nota3 = aulas3.getNota();
		
		Materia aulas4 = new Materia();
		String materia4 = "História";
		aulas4.setMateria(materia4);
		aulas4.setNota(9.0);
		double nota4 = aulas4.getNota();
		
		Materia aulas5 = new Materia();
		String materia5 = "Inglês";
		aulas5.setMateria(materia5);
		aulas5.setNota(5.0);
		double nota5 = aulas5.getNota();
		
		double media = ((nota1 + nota2 + nota3 + nota4 + nota5)/5);
		boolean resultado = (media >= 7);
		if(resultado) {
			System.out.println("O (A) Aluno(a)" + aluno.getAluno());
			System.out.println("Com media" + media);
			System.out.println("Foi Aprovado");
		} else {
			System.out.println("O (A) Aluno(a) " + aluno.getAluno());
			System.out.println("Com media " + media);
			System.out.println("Foi Reprovado");
		}
	}
}
