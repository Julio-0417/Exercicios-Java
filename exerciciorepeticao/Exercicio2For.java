package exerciciorepeticao;

import java.util.Scanner;

public class Exercicio2For {
	/*Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num,numpar=0,numimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira um número: ");
		num = leia.nextInt();
		
		for (num=1;num<=10;num++)
		{
			if (num%2==0) 
			{
				numpar++;
			}
			else
			{
				numimpar++;
			}	
		}
		System.out.println("\nQuantidade de Números Pares:"+numpar);
		System.out.println("\nQuantidade de Números Ímpares:"+numimpar);

	}

}
