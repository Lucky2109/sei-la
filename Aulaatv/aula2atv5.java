package Aulaatv;
import java.util.Scanner;
public class aula2atv5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, n4, n5, n6, n7, qtd, preco;
		
		System.out.println("Código do produto-------Produto-----------------Preço unitário\r\n"
				+ "    .1--------------Cachorro quente---------R$10,00\r\n"
				+ "    .2--------------X-salada----------------R$15,00\r\n"
				+ "    .3--------------X-bacon-----------------R$18,00\r\n"
				+ "    .4--------------Bauru-------------------R$12,00\r\n"
				+ "    .5--------------Refrigerante------------R$8,00\r\n"
				+ "    .6--------------Suco de laranja---------R$13,00");
		System.out.println("digite o codigo do produto: ");
		n7 = leia.nextInt();
		n1 = 10;
		n2 = 15;
		n3 = 18;
		n4 = 12;
		n5 = 8;
		n6 = 13;
		preco = 0;
		System.out.println("digite quantidade: ");
		qtd = leia.nextInt();
		switch (n7) {
		
		case 1: preco = n1 * qtd;
	        
	        break;
	    case 2: preco = n2 * qtd;
	        
	        break;
	    case 3: preco = n3 * qtd;
	        
	        break;
	    case 4: preco = n4 * qtd;
        
        break;
	    case 5: preco = n5 * qtd;
        
        break;
	    case 6: preco = n6 * qtd;
        
        break;
	        
	        
	        
	    default:System.out.println("Não temos essa opção no menu ");
		
		}
		
		System.out.println("o preço da sua compra é R$: "+ preco +",00");
		
		

	}

}
