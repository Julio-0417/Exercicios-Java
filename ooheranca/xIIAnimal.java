package orientacaoobjeto;

/*Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
�, independente do tipo de animal.*/

public class AnimalII {
		
		private String nome;	
		private int idade;
		public void som(){		
		}
		
		public AnimalII (String nome, int idade)
		{
			super();
			this.nome = nome;
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		public void imprimirInfo()
		{
			System.out.println("\nNome do Animal: "+getNome()+"\nIdade: "+getIdade());
		}
	
	

}
