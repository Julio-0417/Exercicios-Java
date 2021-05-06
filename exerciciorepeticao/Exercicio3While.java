package exerciciorepeticao;

import java.util.Scanner;

public class Exercicio3While {
	
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 
	 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,idademenor=0,idademaior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira a idade: ");
		idade = leia.nextInt();
		
		while (idade!=-99)
			{
			    if(idade<21)
		        	{
				    idademenor++;
			        }
		        if(idade>50)
			        {
			    	idademaior++;
			        }
			    System.out.println("\nInsira a idade: ");
			    idade = leia.nextInt();
	
			}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+idademenor);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+idademaior);

	}

}
