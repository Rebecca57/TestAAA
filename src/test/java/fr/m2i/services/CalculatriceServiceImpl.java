package fr.m2i.services;

import fr.m2i.logique.Calculatrice;

public class CalculatriceServiceImpl implements CalculatriceService {
	
	private Calculatrice calculatrice;
	private Double response;
	
	public CalculatriceServiceImpl(Calculatrice calculatrice, Double solution) {
		this.calculatrice = calculatrice;
		//this.solution = solution;	
	}

	public Double calcul(String methode, Double a, Double b) {
		
		if (methode.equals("+")) {
			this.response =  calculatrice.addition(a, b);
		}
		else if (methode.equals("-")) {
			this.response = calculatrice.soustraction(a, b);
		}
		else {
			response = 0.0;
		}
		return response;
	}

	public Double getResponse() {
		return response;
	}

	/**
	public void setResponse(Double response) {
		this.response = response;
	}
	**/
	

}
