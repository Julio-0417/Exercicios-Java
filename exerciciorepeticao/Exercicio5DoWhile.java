package exerciciorepeticao;

import java.util.Scanner;

public class Exercicio5DoWhile {
	/*Crie um programa que leia um n�mero do teclado at� que encontre um 
	 * n�mero igual a zero. No final, mostre a soma dos n�meros digitados.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somanum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira um n�mero: ");
		num = leia.nextInt();
		
		do
		{
			somanum = somanum + num;
			System.out.println("\nInsira um n�mero: ");
			num = leia.nextInt();			
		}
		while(num!=0);
		
		System.out.println("\nSomat�rio dos n�meros: "+somanum);
	}

}
