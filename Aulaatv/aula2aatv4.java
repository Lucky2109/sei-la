package Aulaatv;
import java.util.Scanner;
public class aula2aatv4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String palavra1, palavra2, palavra3;

		
		System.out.println("digite a sua primeira palavra: ");
		palavra1 = leia.nextLine();
		
		System.out.println("digite a sua segunda palavra: ");
		palavra2 = leia.nextLine();
		
		System.out.println("digite a sua terceira palavra: ");
		palavra3 = leia.nextLine();
		
		if( palavra1. equalsIgnoreCase ("vertebrado") ) {
			
			if( palavra2. equalsIgnoreCase("mamifero") ) {
				if( palavra3.equals ("onivoro") ) {
					System.out.println("Homem ");
		
					
				} else {
					System.out.println("Vaca");}
				}
			if( palavra2. equalsIgnoreCase("ave") ) {
				if( palavra3.equalsIgnoreCase ("carnívoro") ) {
					System.out.println("Àguia ");
		
					
				} else {
					System.out.println("pomba");}
				}
				
			}
		if( palavra1. equalsIgnoreCase ("invertebrado") ) {
			
			if( palavra2. equalsIgnoreCase("inseto") ) {
				if( palavra3.equalsIgnoreCase ("Hematófago") ) {
					System.out.println("Pulga ");
		
					
				} else {
					System.out.println("Lagarta");}
				}
			if( palavra2. equalsIgnoreCase("anelideo") ) {
				if( palavra3.equalsIgnoreCase ("onivoro") ) {
					System.out.println("Minhoca ");
		
					
				} else {
					System.out.println("Sanguesuga");}
				}
				
			}
		
		
			
		}
	}
	


