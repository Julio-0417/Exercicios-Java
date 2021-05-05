package laçocond;

import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a sua idade: ");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade <= 14)
		{
			System.out.println("\nCategoria: Infantil");
		}
		else if (idade >= 15 && idade <= 17)
		{
			System.out.println("\nCategoria: Juvenil");
		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("\nCategoria: Adulto");
		}
		else if (idade < 10 || idade > 25)
		{
			System.out.println("\nIdade fora da categoria");
		}	
		else 
		{
			System.out.println("\nIdade inválida!!!");
		}

	}

}
