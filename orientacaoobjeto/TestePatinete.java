package orientacaoobjeto;

public class TestePatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patinete[] listagem = new Patinete[5];

		listagem[0] = new Patinete("M365","Xaomi","Elétrica",5319.99);
        listagem[1] = new Patinete("Two Dogs 1600W","Two Dogs","Elétrica",7490);
		listagem[2] = new Patinete("Titan Juvenil","Bel Sports","Manual",749.90);
		listagem[3] = new Patinete("Veloks","Divoks","Manual",899.90);
		listagem[4] = new Patinete("Egow Hero","Egow","Elétrica",6490.99);
		
		
		for(Patinete verificar:listagem) 
		{
			verificar.imprimirInfo();
		}

	}

}
