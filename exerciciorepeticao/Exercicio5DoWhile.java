package exerciciorepeticao;

import java.util.Scanner;

public class Exercicio5DoWhile {
	/*Crie um programa que leia um número do teclado até que encontre um 
	 * número igual a zero. No final, mostre a soma dos números digitados.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somanum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira um número: ");
		num = leia.nextInt();
		
		do
		{
			somanum = somanum + num;
			System.out.println("\nInsira um número: ");
			num = leia.nextInt();			
		}
		while(num!=0);
		
		System.out.println("\nSomatório dos números: "+somanum);
	}

}
