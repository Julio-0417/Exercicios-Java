package vetormatriz;

import java.util.Scanner;

public class Exercicio2Vetor {
	/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	 * � Os n�meros pares digitados;  
	 * � A soma dos n�meros pares digitados; 
	 * � Os n�meros �mpares digitados; 
	 * � A quantidade de n�meros �mpares digitados.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int [] num = new int [6];
		int x,somapar=0,qtddi=0;
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nInsira um n�mero: ");
			num[x] = leia.nextInt();
			
			if (num[x]%2==0)
			{
				somapar = somapar + num[x];		
				System.out.println("\nN�mero "+num[x]+" � par!");
			}
			else
			{
				qtddi++;
				System.out.println("\nN�mero "+num[x]+" � impar!");
			}
		}
		System.out.println("\nSomat�ria N�meros Pares: "+somapar);
		System.out.println("\nQuantidade de entradas com N�meros �mpares: "+qtddi);
	}
}
