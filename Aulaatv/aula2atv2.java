package Aulaatv;
import java.util.Scanner;
public class aula2atv2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("digite um numero: ");
		a = leia.nextInt();
		
		if (a < 0 && a % 2 == 1  ) {
			System.out.println( a + " é um numero é negativo e impar");
			
		}if (a > 0 && a % 2 == 0  ) {
			System.out.println(a + " o numero é positivo e par ");
			
		}if (a < 0 && a % 2 == 0  ) {
			System.out.println(a +" o numero é negativo e par ");
			
		}
		if (a > 0 && a % 2 == 1  ) {
			System.out.println(a +" o numero é negativo e impar ");
			
		}
		
		
		

	}

}
