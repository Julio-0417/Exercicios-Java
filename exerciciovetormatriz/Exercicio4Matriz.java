package vetormatriz;

import java.util.Scanner;

public class Exercicio4Matriz {
	/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
	 * Ofereça ao usuário um menu de opções:
	 * (1) somar as duas matrizes 
	 * (2) subtrair a primeira matriz da segunda 
	 * (3) adicionar uma constante as duas matrizes
	 * (4) imprimir as matrizes 
	 * Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
	 * Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante 
	 * deve ser armazenado na própria matriz.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float m1[][] = new float [2][2];
		float m2[][] = new float [2][2];
		float mx[][] = new float [2][2];
		int lin=0,col=0,op=0,c=0;
		
		for (lin=0;lin<2;lin++)	
		{
			for (col=0;col<2;col++)
			{
				System.out.println("Insira um valor para a Matriz 1(M1): ");
				m1[lin][col] = leia.nextFloat();
			}
		}
		for (lin=0;lin<2;lin++)	
		{
			for (col=0;col<2;col++)
			{
				System.out.println("Insira um valor para a Matriz 2(M2): ");
				m2[lin][col] = leia.nextFloat();
			}
		}
		
		System.out.println("\n\t\tMenu de opções");
        System.out.println("\n1-Somar: M1 + M2\n2-Subtrair: M1 - M2\n3-Adicionar constante às matrizes\n4-Imprimir Matrizes");
        System.out.println("\nDigite sua opção: ");
        op = leia.nextInt();
        
		switch(op)
		{
		    case 1:
		    
		    	for(lin=0;lin<2;lin++)
				{
					for(col=0;col<2;col++)
					{
						mx[lin][col] = m1[lin][col] + m2[lin][col];
						System.out.printf("\t %2.0f \t",mx[lin][col]);	
					}
					System.out.println();
				}
				break;
	        	
	        case 2:
	        	
	        	for(lin=0;lin<2;lin++)
				{
					for(col=0;col<2;col++)
					{
						mx[lin][col] = m1[lin][col] - m2[lin][col];
						System.out.printf("\t %2.0f \t",mx[lin][col]);		
					}
					System.out.println();
				}
				break;
	        	
	        case 3:
	        	
	        	System.out.println("Insira o valor da constante: ");
	        	c = leia.nextInt();
	        	
	        	for(lin=0;lin<2;lin++)
				{
					for(col=0;col<2;col++)
					{
						m1[lin][col] = m1[lin][col] + c;
						System.out.printf("\t %2.0f \t",m1[lin][col]);	
					}
					System.out.println();
				}
	        	System.out.println();
	        	
	        	for(lin=0;lin<2;lin++)
				{
					for(col=0;col<2;col++)
					{
						m2[lin][col] = m2[lin][col] + c;	
						System.out.printf("\t %2.0f \t",m2[lin][col]);	
					}
					System.out.println();
				}
				break;
	        	
	        case 4:  	
	        	
	        	for(lin=0;lin<2;lin++)
				{
					for(col=0;col<2;col++)
					{
						System.out.printf("\t %2.0f \t",m1[lin][col]);	
					}
					System.out.println();
				}
	        	System.out.println();
	        	
	        	for(lin=0;lin<2;lin++)
				{
					for(col=0;col<2;col++)
					{
						System.out.printf("\t %2.0f \t",m2[lin][col]);	
					}
					System.out.println();
				}
				break;   
				default:
	        	System.out.println("\nOpção inválida!!!");  
		}
	}
}
