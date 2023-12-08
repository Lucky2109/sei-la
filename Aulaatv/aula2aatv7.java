package Aulaatv;
import java.util.Scanner;
public class aula2aatv7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float nu1, nu2, n3 = 0;
		int n5 ;
		
		
		System.out.println("Código  ------  Operação\r\n"
		        + ".1  ----------  Soma +\r\n"
		        + ".2  ----------  Subtração - \r\n"
		        + ".3  ----------  Multiplicação * \r\n"
		        + ".4  ----------  Divisão /");
		System.out.println("Digite o primeiro numero");
		nu1 = leia.nextFloat();
		System.out.println("Digite o segundo numero");
		nu2 = leia.nextFloat();
		System.out.println("Escolha o numero da operação");
		n5 = leia.nextInt();
		
		switch (n5) {
		case 1: n3 = nu1 + nu2;
		
		break;
		
case 2:n3 = nu1 - nu2;
		
	break;
case 3:n3 = nu1 * nu2;

break;
case 4:n3 = nu1 / nu2;

break;


default:System.out.println("Operação invalida ");
;
		
		
		}
System.out.println("O resultado da operação é: "+ n3);

	}

}
