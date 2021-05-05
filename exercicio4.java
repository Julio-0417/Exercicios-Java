package laçocond;

import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		num = ler.nextFloat();
		
		if (num%2==0)
		{
			System.out.println("\nO Número é Par!");
			System.out.println("\nRaiz quadrada do número: "+Math.sqrt(num));
		}
		else
		{
			System.out.println("\nO Número é Ímpar!");
			System.out.println("\nNúmero elevado ao quadrado: "+Math.pow(num, 2));
		}

	}

}
