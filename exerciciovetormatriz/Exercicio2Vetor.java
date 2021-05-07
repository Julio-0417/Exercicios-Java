package vetormatriz;

import java.util.Scanner;

public class Exercicio2Vetor {
	/*Faça um programa que receba 6 números inteiros e mostre: 
	 * • Os números pares digitados;  
	 * • A soma dos números pares digitados; 
	 * • Os números ímpares digitados; 
	 * • A quantidade de números ímpares digitados.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int [] num = new int [6];
		int x,somapar=0,qtddi=0;
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nInsira um número: ");
			num[x] = leia.nextInt();
			
			if (num[x]%2==0)
			{
				somapar = somapar + num[x];		
				System.out.println("\nNúmero "+num[x]+" é par!");
			}
			else
			{
				qtddi++;
				System.out.println("\nNúmero "+num[x]+" é impar!");
			}
		}
		System.out.println("\nSomatória Números Pares: "+somapar);
		System.out.println("\nQuantidade de entradas com Números Ímpares: "+qtddi);
	}
}
