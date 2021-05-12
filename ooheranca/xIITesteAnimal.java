package orientacaoobjeto;

/*Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/

public class TesteAnimalII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CachorroII Cachorro = new CachorroII ("Costelinha",12);
		CavaloII Cavalo = new CavaloII ("Leviano",7);
		PreguicaII Preguica = new PreguicaII ("Leseira",5);
		
		Cachorro.imprimirInfo();
		Cachorro.som();
		Cavalo.imprimirInfo();
		Cavalo.som();
		Preguica.imprimirInfo();		
		Preguica.som();
	}
}
