package fr.m2i.main;

import java.util.Arrays;
import java.util.Scanner;

import fr.m2i.Models.CalculatriceModel;
import fr.m2i.Models.Operation;
import fr.m2i.logique.Calculatrice;
import fr.m2i.services.CalculatriceService;
import fr.m2i.services.CalculatriceServiceImpl;


public class Main {

	public static void main(String[] args) throws Exception {
		Calculatrice calculatrice = new Calculatrice();
		CalculatriceService calculatriceService = new CalculatriceServiceImpl(calculatrice);
		
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
				
				Double rep = calculatriceService.calcul(new CalculatriceModel(a, b,Operation.getOperation(methode))).getResultat();
					
				System.out.println("a"+methode+"b= " + rep);
			}
			System.out.println("Continuer? (y/n)");
			keep = (sc.nextLine().equals("y"))?true:false;
			
		}while(keep);
			
		System.out.println("Merci d'avoir utiliser The Calculator ");
	}

}
