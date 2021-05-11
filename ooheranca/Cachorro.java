package orientacaoobjeto;

public class Cachorro extends Animal {
	
	private String habilidade;
	
	public Cachorro (String nome, int idade, String som,String habilidade)
	{
		super(nome,idade,som);
		this.habilidade = habilidade;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	public void imprimirHabilidade()
	{
		System.out.println("Habilidade: "+getHabilidade());
	}
	
	

}
