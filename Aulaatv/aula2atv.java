package Aulaatv;

import java.util.Scanner;

public class aula2atv {

	public static void main(String[] args) {
		
		float a, b, c, d;
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.println("digite o valor a: ");
		a = leia.nextInt();
		System.out.println("digite o valor b: ");
		b = leia.nextInt();
		System.out.println("digite o valor c: ");
		c = leia.nextInt();
		
		if (a + b> c) {
			System.out.println("a soma dos valores A e B é maior do que c ");
			
		}if(a + b< c) {
			System.out.println("a soma dos valores A e B é menor do que c ");
			
		}if(a + b == c) {
			System.out.println("a soma dos valores A e B é igual a c ");
			
		}
		
		
		

	}

}
