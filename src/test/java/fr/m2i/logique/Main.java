package fr.m2i.logique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculatrice calculatrice = new Calculatrice();
		
		boolean keep = true;
		do {	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Quelle méthode voulez-vous utiliser? (+,-,*,/,**)");
			String methode = sc.nextLine();
			
			if (! Arrays.asList("+","-","*","/","**").contains(methode)) {
				System.out.println("La méthode n'est pas correcte!");
			}
			else {
				System.out.println("Valeur Double a: ");
				Double a = Double.parseDouble(sc.nextLine());
				
				System.out.println("Valeur Double b: ");
				Double b = Double.parseDouble(sc.nextLine());
				
				Double rep = 0.0;
				
				if (methode.equals( "+")) {
					rep = calculatrice.addition(a, b);
				}
				else if (methode.equals( "-")) {
					rep = calculatrice.soustraction(a, b);
				}
				else if (methode.equals( "*")) {
					rep = calculatrice.multiplication(a, b);
				}
				else if (methode.equals( "/")) {
					rep = calculatrice.division(a, b);
				}			
				else if (methode.equals( "**")) {
					rep = calculatrice.power(a, b);
				}
					
				System.out.println("a"+methode+"b= " + rep);
			}
			System.out.println("Continuer? (y/n)");
			keep = (sc.nextLine().equals("y"))?true:false;
			
		}while(keep);
			
		System.out.println("Merci d'avoir utiliser The Calculator ");
	}

}
