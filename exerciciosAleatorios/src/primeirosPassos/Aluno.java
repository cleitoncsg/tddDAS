package primeirosPassos;

public class Aluno {
	
	private int matricula;

	public void setMatricula(int matricula) {
		this.matricula = matricula;	
	}

	public int getMatricula() {
		if(matricula < 0)
			throw new IllegalArgumentException("Matricula Negativa");
		return matricula;
	}

}
