package fr.m2i.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

import fr.m2i.logique.Calculatrice;
import fr.m2i.logique.HelloWorld;

public class FirstTest {
	
	
	@Test
	void sayHello() {
		//Organiser
		String resultatAttendu = "Hello, the world!";
		HelloWorld hw = new HelloWorld();
		
		//Agir
		String resultatObtenu = hw.sayHello();
		
		//Verifier
		assertEquals(resultatAttendu, resultatObtenu);
	}
	
	//@ParameterizedTest
    
	@ParameterizedTest
	@CsvSource({ "1.2, 3.5"})
	@Test
	void addition() {
		Double resultatAttendu = 4.7;
		Double a = 1.2;
		Double b = 3.5;
		//Calculatrice calc = new Calculatrice();
		Double resultatObtenu = Calculatrice.addition(a,b);
		assertEquals(resultatAttendu, resultatObtenu);
	}
	
	@ParameterizedTest
	@CsvSource({ "5.0, 1.5"})
	@Test
	void soustraction() {
		Double resultatAttendu = 3.5;
		Double a = 5.0;
		Double b = 1.5;
		//Calculatrice calc = new Calculatrice();
		Double resultatObtenu = Calculatrice.soustraction(a,b);
		assertEquals(resultatAttendu, resultatObtenu);
	}
	
	@ParameterizedTest
	@CsvSource({ "5.0, 1.5"})
	@Test
	void multiplication() {
		Double resultatAttendu = 7.5;
		Double a = 5.0;
		Double b = 1.5;
		//Calculatrice calc = new Calculatrice();
		Double resultatObtenu = Calculatrice.multiplication(a,b);
		assertEquals(resultatAttendu, resultatObtenu);
	}
	
	@ParameterizedTest
	@CsvSource({"5.0, 2.0"})
	@Test
	void division() {
		Double resultatAttendu = 2.5;
		Double a = 5.0;
		Double b = 2.0;
		//Calculatrice calc = new Calculatrice();
		Double resultatObtenu = Calculatrice.division(a,b);
		assertEquals(resultatAttendu, resultatObtenu);
	}
	
	@ParameterizedTest
	@CsvSource({"5.0, 2.0"})
	@Test
	void power() {
		Double resultatAttendu = 25.0;
		Double a = 5.0;
		Double b = 2.0;
		//Calculatrice calc = new Calculatrice();
		Double resultatObtenu = Calculatrice.power(a,b);
		assertEquals(resultatAttendu, resultatObtenu);
	}


}
