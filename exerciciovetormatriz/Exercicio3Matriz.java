package vetormatriz;

import java.util.Scanner;

public class Exercicio3Matriz {
	/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float [][] matriz = new float [3][3];
		int lin,col,cont=0;
		
		for (lin=0;lin<3;lin++)	
		{
			for (col=0;col<3;col++)
			{
				System.out.println("Insira um valor: ");
				matriz[lin][col] = leia.nextFloat();
				
				if(matriz[lin][col]>10)
				{
					cont++;
				}
			}
		}
		System.out.println("\nQuantidade de valores maiores que 10: "+cont);
	}
}
