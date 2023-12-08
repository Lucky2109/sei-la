package Aulaatv;
import java.util.Scanner;
public class aulaatv8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float  saque, deposito, saldo = 1000;
		int n5 ;
		
		
		System.out.println("Código  ------  Operação\r\n"
		        + ".1  ----------  Saldo \r\n"
		        + ".2  ----------  Saque \r\n"
		        + ".3  ----------  Deposito \r\n");
		System.out.println("Digite o tipo de operação a ser realizada: ");
		
		System.out.println("Digite o segundo numero");
		
		System.out.println("Escolha o numero da operação");
		n5 = leia.nextInt();
		
		switch (n5) {
		case 1: System.out.println("Seu saldo é" + saldo);
		
		break;
		
case 2:System.out.println("Digite o valor do saque");
	saque = leia.nextFloat();
	if(saque > saldo) {
		
		System.out.println("Saldo insuficiente" );	
		
	}else {
		saldo = saldo-saque;
		System.out.println("Seu saldo é " + saldo);
	}
			
	;
		
	break;
case 3:System.out.println("Digite o valor do deposito ");
	deposito = leia.nextFloat();
	saldo = saldo + deposito;
System.out.println("Seu saldo é" + saldo);

break;



default:System.out.println("Operação invalida ");
;
		
		
		}


	}

}
