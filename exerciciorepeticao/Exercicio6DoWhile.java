package exerciciorepeticao;

import java.util.Scanner;

public class Exercicio6DoWhile {
	/*Escrever um programa que receba vários números inteiros no teclado. E no 
	 * final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)*/
	
	public static void main(String[] args) {
		int num,x=0,somamult=0;
		float medianum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira um número: ");
		num = leia.nextInt();
		
		do
		{
			if(num%3==0)
			{
				x++;
				somamult = somamult + num;
			}
			else
			{
				
			}	
			System.out.println("\nInsira um número: ");
			num = leia.nextInt();			
		}
		while(num!=0);
		
		medianum = somamult/x;
		System.out.println("\nMédia dos números múltiplos de 3: "+medianum);
	}

}
