package exerciciorepeticao;

import java.util.Scanner;

public class Exercicio4While {
	/*Uma empresa desenvolveu uma pesquisa para saber as características 
	 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas 
	 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
	 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era 
	 * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 
	 * pessoas, calcule e mostre:
       o número de pessoas calmas;
       o número de mulheres nervosas;
       o número de homens agressivos;
       o número de outros calmos;
       o número de pessoas nervosas com mais de 40 anos;
       o número de pessoas calmas com menos de 18 anos.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,sexo,cp,pc=0,mn=0,ha=0,oc=0,n40=0,c18=0,x=1;
		
		Scanner leia = new Scanner(System.in);
        
        while (x<=150)
        {
        	System.out.println("Insira a sua idade: ");
            idade = leia.nextInt();
            
            System.out.println("\nSexo:");
            System.out.println("\n1-Feminino\n2-Masculino\n3-Outros");
            sexo = leia.nextInt();
    		
            System.out.println("\nCaracterística Psicológica:");
            System.out.println("\n1-Calma\n2-Nervosa\n3-Agressiva");
            cp = leia.nextInt();
            
            if(cp==1)
            {
            	pc++;
            }
            if(sexo==1 && cp==2)
			{
				mn++;
			}
			if(sexo==2 && cp==3)
			{
				ha++;
			}
			if(sexo==3 && cp==1)
			{
				oc++;
			}
			if(cp==2 && idade>40)
			{
				n40++;
			}
			if (cp==1 && idade<18)
			{
				c18++;
			}
            x++;
        }
		System.out.println("\nQuantidade de Pessoas Calmas: "+pc);
		System.out.println("\nQuantidade de Mulheres Nervosas: "+mn);
		System.out.println("\nQuantidade de Homens Agressivos: "+ha);
		System.out.println("\nQuantidade de Outros Calmos: "+oc);
		System.out.println("\nQuantidade de Pessoas Nervosas com mais de 40 anos: "+n40);
		System.out.println("\nQuantidade de Pessoas Calmas com menos que 18 anos: "+c18);
	}
}
	
