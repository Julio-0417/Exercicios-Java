package orientacaoobjeto;

/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Paciente {
	
	private String nomePaciente;
	private int idade;
	private int numRegistro;
	private int numQuarto;
	private String quadroClinico;
	private String avaliacaoMedica;
	
	public Paciente (String nomePaciente,int idade, int numRegistro,int numQuarto, String quadroClinico, String avaliacaoMedica)
	{
		this.nomePaciente = nomePaciente;
		this.idade = idade;
		this.numRegistro = numRegistro;
		this.numQuarto = numQuarto;
		this.quadroClinico = quadroClinico;
		this.avaliacaoMedica = avaliacaoMedica;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	public String getQuadroClinico() {
		return quadroClinico;
	}

	public void setQuadroClinico(String quadroClinico) {
		this.quadroClinico = quadroClinico;
	}

	public String getAvaliacaoMedica() {
		return avaliacaoMedica;
	}

	public void setAvaliacaoMedica(String avaliacaoMedica) {
		this.avaliacaoMedica = avaliacaoMedica;
	}
	public void imprimirInfo()
	{
		System.out.println("\nFicha do Paciente \nNome: "+nomePaciente+"\nIdade: "+idade+"\nNúmero de Registro: "+numRegistro+"\nQuarto onde está alocado: "+numQuarto+"\nQuadro Clínico: "+quadroClinico+"\nAvaliação Médica Atualizada: "+avaliacaoMedica);
	}

}
