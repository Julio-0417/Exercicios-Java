package orientacaoobjeto;

public class TesteCliente {
	/*Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cliente cliente1 = new Cliente("Henrique","11999999999","São Paulo",39);
		cliente1.imprimirInfo();
		
		Cliente cliente2 = new Cliente("Jussara","71888888888","Salvador",19);
		cliente2.imprimirInfo();
		System.out.println("\n***Atualização cadastro - Cidade***");
		cliente2.setCidade("Lauro de Freitas");
		cliente2.imprimirInfo();
		
		Cliente cliente3 = new Cliente ("Helena","21777777777","Rio de Janeiro",42);
		cliente3.imprimirInfo();
		
		Cliente cliente4 = new Cliente ("Carminha","21666666666","Rio de Janeiro",39);
		cliente4.imprimirInfo();
		System.out.println("\n***Atualização cadastro - Nome***");
		cliente4.setNomeCliente("Carmem Lúcia");
		cliente4.imprimirInfo();

	}

}
