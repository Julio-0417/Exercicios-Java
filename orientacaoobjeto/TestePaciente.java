package orientacaoobjeto;

/*Crie uma classe paciente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente[] relacao = new Paciente[5];

		relacao[0] = new Paciente("Luciana Abreu",23,12569,06,"Pneumonia Aguda","Administrar antibi�ticos");
		relacao[1] = new Paciente("Yasmin Pereira",35,12577,02,"Fratura �mero","Imobiliza��o com tala gessada");
		relacao[2] = new Paciente("Val�rio Moreno",43,12571,04,"S�ncope por calor","Observa��o e alta");
		relacao[3] = new Paciente("Enzo Damasceno",13,12573,01,"Retirada da am�gdala","Repouso e observa��o");
		relacao[4] = new Paciente("Tereza Carvalho",61,12576,05,"C�lculo Renal","Administra��o de analg�sico e Ultrassonografia");
		
		for(Paciente repassar:relacao) 
		{
			repassar.imprimirInfo();
		}
		
		System.out.println("***************************");

	}

}
