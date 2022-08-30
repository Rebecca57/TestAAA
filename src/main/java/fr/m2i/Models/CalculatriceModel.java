package fr.m2i.Models;

public class CalculatriceModel {
	
	//Attributes
	private Double a;
	private Double b;
	private Operation methode;
	private Double Resultat;
	
	//Constructeur
	public CalculatriceModel(Double a, Double b, Operation methode) {
		this.setA(a);
		this.setB(b);
		this.setMethode(methode);
	}
	
	//Methodes

	//Getter and Setter
	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Operation getMethode() {
		return methode;
	}

	public void setMethode(Operation methode) {
		this.methode = methode;
	}

	public Double getResultat() {
		return Resultat;
	}

	public void setResultat(Double resultat) {
		Resultat = resultat;
	}

}
