package la�ocond;

import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		num = ler.nextFloat();
		
		if (num%2==0)
		{
			System.out.println("\nO N�mero � Par!");
			System.out.println("\nRaiz quadrada do n�mero: "+Math.sqrt(num));
		}
		else
		{
			System.out.println("\nO N�mero � �mpar!");
			System.out.println("\nN�mero elevado ao quadrado: "+Math.pow(num, 2));
		}

	}

}
