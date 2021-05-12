package orientacaoobjeto;

/*Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/

public class CavaloII extends AnimalII {
	
	public CavaloII(String nome, int idade)
	{
		super(nome, idade);
	}
	
	@Override
	public void som()
	{
		System.out.println("Emite relincho");
	}

}
