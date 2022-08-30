package fr.m2i.Models;


public enum Operation{
	
		ADDITION,
		SOUSTRACTION,
		MULTIPLICATION,
		DIVISION,
		PUISSANCE;
	
	public static Operation getOperation(String symbol) throws Exception {
		switch(symbol){
			case "+":
				return ADDITION;
			case "-":
				return SOUSTRACTION;
			case "*":
				return MULTIPLICATION;
			case "/":
				return DIVISION;
			case "**":
				return PUISSANCE;
			default:
				throw new Exception("This opération is not valid!");
		}
	}

}
