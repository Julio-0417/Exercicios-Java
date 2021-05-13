package colecao;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
- Armazenar dados da List
- Remover dados da list;
- Atualizar dados da list.
- Apresentar todos os dados da list.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3Colecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoqueLoja = new ArrayList();
		
		do
		{
			System.out.println("\n************************");
			System.out.println("\nSelecione uma das seguintes opções: ");
			System.out.println("\n1 - Acrescentar produto ao estoque");
			System.out.println("\n2 - Remover produto do estoque");
			System.out.println("\n3 - Atualizar o estoque");
			System.out.println("\n4 - Mostrar estoque completo");
			System.out.println("\n0 - Encerrar programa");
			System.out.println("\nQual opção deseja?: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nQual o produto a ser adicionado?: ");
				String produto = leia.nextLine();
				estoqueLoja.add(produto);
				break;
				
			case 2:
				leia.nextLine(); 
				System.out.println("\nQual produto remover?: ");
				String produto1 = leia.nextLine();
				
				if(estoqueLoja.contains(produto1))
				{
					estoqueLoja.remove(produto1);
				}
				else
				{
					System.out.println("\nEste produto não existe neste estoque!!!");
				}
				break;
				
			case 3:
				leia.nextLine(); 
				System.out.println("\nQual produto atualizar no estoque?: ");
				String verifica = leia.nextLine();
				System.out.println("\nQual novo produto adicionar?: ");
				String novo = leia.nextLine();
				
				if(estoqueLoja.contains(verifica))
				{
					estoqueLoja.remove(verifica);
					estoqueLoja.add(novo);
				}
				else
				{
					System.out.println("\nEste produto não existe neste estoque!!!");
				}
				break;
				
			case 4:
				System.out.println("\nLista de produtos do estoque: ");
				System.out.println(estoqueLoja);
				break;
				
				default:
					System.out.println("\nEncerrando o programa...");
			}
		}while(op!=0);

	}

}
