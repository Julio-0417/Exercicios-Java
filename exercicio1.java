package la�ocond;

import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3,nummaior=0;
		
        Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		num1 = ler.nextInt();
		System.out.println("Insira um n�mero: ");
		num2 = ler.nextInt();
		System.out.println("Insira um n�mero: ");
		num3 = ler.nextInt();
		
		if (num1 >= num2 && num1 >= num3)
		{
			nummaior = num1;
		}
		else if (num2 >= num1 && num2 >= num3)
		{
			nummaior = num2;
		}
		else if (num3 >= num2 && num3 >= num1)
		{
			nummaior = num3;
		}
		
		System.out.println("Maior n�mero foi: "+nummaior);

	}

}
