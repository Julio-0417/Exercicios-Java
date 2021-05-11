package orientacaoobjeto;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro Cachorro = new Cachorro ("Costelinha",12,"Ladra","Correr");
		Cavalo Cavalo = new Cavalo ("Leviano",7,"Relincha","Correr");
		Preguica Preguica = new Preguica ("Leseira",5,"Grunhe","Subir em Árvores");
		
		Cachorro.imprimirInfo();
		Cachorro.imprimirHabilidade();
		Cavalo.imprimirInfo();
		Cavalo.imprimirHabilidade();
		Preguica.imprimirInfo();		
		Preguica.imprimirHabilidade();

	}

}
