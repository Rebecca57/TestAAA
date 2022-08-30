package fr.m2i.services;

import fr.m2i.Models.CalculatriceModel;
import fr.m2i.Models.Operation;
import fr.m2i.logique.Calculatrice;

public class CalculatriceServiceImpl implements CalculatriceService {
	
	private Calculatrice calculatrice;
	
	public CalculatriceServiceImpl(Calculatrice calculatrice) {
		this.calculatrice = calculatrice;
		//this.solution = solution;	
	}

	public CalculatriceModel calcul(CalculatriceModel calcModel) throws Exception {
		
		Double a = calcModel.getA();
		Double b = calcModel.getB();
		final Operation type = calcModel.getMethode();
		
		switch(type) {
			case ADDITION:
				calcModel.setResultat(calculatrice.addition(a, b));
				return calcModel;
			case SOUSTRACTION:
				calcModel.setResultat(calculatrice.soustraction(a, b));
				return calcModel;

			case MULTIPLICATION:
				calcModel.setResultat(calculatrice.multiplication(a, b));
				return calcModel;

			case DIVISION:
				calcModel.setResultat(calculatrice.division(a, b));
				return calcModel;
			case PUISSANCE:
				calcModel.setResultat(calculatrice.power(a, b));
				return calcModel;
			default:
				throw new Exception("This operation is not valid");
		}
	}
		


	

}
