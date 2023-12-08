package Aulaatv;
import java.util.Scanner;
public class aula2atv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeira;
		
		System.out.println("Digite seu Nome: ");
		nome = leia.nextLine();
		System.out.println("Digite sua Idade: ");
		idade = leia.nextInt();
		System.out.println("Digite se é ou não sua primeira doação: ");
		primeira = leia.nextBoolean();
		
		if (idade >18 && idade <= 59  ) {
			System.out.println( nome + " esta apto a doar ");
			
		}
		if (idade >69  ) {
			System.out.println( nome + " esta inapto a doar ");
			
		}
		if (idade >=60 && idade <=69) {
			if (primeira == false) {
				System.out.println( nome + " esta apto a doar ");
				}
			else {
				System.out.println( nome + " esta inapto a doar ");
				
				
			}
				
			
		}
		
				
			
			
			
		}

	

}
