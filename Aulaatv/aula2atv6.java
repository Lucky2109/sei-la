package Aulaatv;

import java.util.Scanner;

public class aula2atv6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String n1, n2, n3, n4, n5, n6, nome;
		float salario, reajuste, novosalario; 
		int n7;
		
		System.out.println("digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("digite o codigo do seu cargo: ");
		n7 = leia.nextInt();
		n1 = "1 Gerente";
		n2 = "2 Vendedor";
		n3 = "3 Supervisor";
		n4 = "4 Motorista";
		n5 = "5 Estoquista";
		n6 = "6 Técnico de TI";
		
		System.out.println("digite seu salario: ");
		salario = leia.nextFloat();
		switch (n7) {
		
		case 1: novosalario = salario +( 10 * salario/100);
		System.out.println(nome +" da profissão "+ n1 +" seu reajuste é de R$ "+ novosalario);
	        
	        break;
	    case 2: novosalario = salario +(7 * salario/100);
	    System.out.println(nome +" da profissão "+ n2 +" seu reajuste é de R$ "+ novosalario );
	        
	        break;
	    case 3: novosalario = salario +(9 * salario/100);
	    System.out.println(nome +" da profissão "+ n3 +" seu reajuste é de R$ "+ novosalario);
	        
	        break;
	    case 4: novosalario = salario +(6 * salario/100);
	    System.out.println(nome +" da profissão "+ n4 +" seu reajuste é de R$ "+ novosalario);
        
        break;
	    case 5: novosalario = salario +(5 * salario/100);
	    System.out.println(nome +" da profissão "+ n5 +" seu reajuste é de "+ novosalario);
        
        break;
	    case 6: novosalario = salario +(8 * salario/100);
	    System.out.println(nome +" da profissão "+ n6 +" seu reajuste é de"+ novosalario);
        
        break;
	        
	        
	        
	    default:System.out.println("Não temos essa profissão ");
		
		}

	}

}
