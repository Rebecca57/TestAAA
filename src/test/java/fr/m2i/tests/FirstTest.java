package fr.m2i.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import fr.m2i.logique.Calculatrice;
import fr.m2i.logique.HelloWorld;

@DisplayName("Mes test à moi")
public class FirstTest {
	
	private HelloWorld hw;
	private static Instant debutTest;
	
	private Logger logger;
	private Calculatrice calculatrice;
	
	/**
	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
**/
	
	@DisplayName("TestInit")
	@BeforeEach
	public void init() {
		this.hw = new HelloWorld();
		this.calculatrice = new Calculatrice();
	}
	
	@DisplayName("TestClean")
	@AfterEach
	public void clean() {
		this.hw=null;
	}
	
	@DisplayName("Before all tests")
	@BeforeAll
	static public void initialisationDesTests() {
		debutTest = Instant.now();
		assertTrue(19>18 && 19<20 );
	}
	
	@DisplayName("After all tests")
	@AfterAll
	static public void finDesTests() {
		
		Instant fin = Instant.now();
		System.out.println(MessageFormat.format("Les tests se sont terminés en : {0} ms",Duration.between(debutTest, fin).toMillis()));
		
	}
	
	
	@ParameterizedTest(name="Ce test doit afficher: {0}")
	@ValueSource(strings = {"Hello"})
	public void afficherHello(String arg) {
		String resultatAttendu = arg;
		String resultatObtenu = this.hw.sayHello();
		
		//Verifier
		assertEquals(resultatAttendu, resultatObtenu);
		
	}
    
	//@RepeatedTest(3)
	@Timeout(1000)
	@ParameterizedTest(name="Opération {0} + {1} doit être égale à {2}")
	@CsvSource({"1.2,3.5,4.7","5,3,8","19,0,19"})
	void addition(Double arg1, Double arg2, Double resultatAttendu) {

		//Set<Double> monSet = new HashSet<Double>(Arrays.asList())
		
		Double resultatObtenu = calculatrice.addition(arg1,arg2);
		assertThat(resultatObtenu).isEqualTo(resultatAttendu);
		//assertEquals(resultatAttendu, resultatObtenu);
	}
	

	@ParameterizedTest(name="Opération {0} - {1} doit être égale à {2}")
	@CsvSource({"5.0, 2.0,3.0","12.0,3.0,9.0"})
	void soustraction(Double arg1, Double arg2, Double arg3) {
		//Calculatrice calc = new Calculatrice();
		Double resultatObtenu = calculatrice.soustraction(arg1,arg2);
		assertThat(resultatObtenu).isEqualTo(arg3);
		//assertEquals(arg3, resultatObtenu);
	}
	

	@ParameterizedTest(name="Opération {0} * {1} doit être égale à {2}")
	@CsvSource({"5.0, 2.0,10.0","12.0,3.0,36.0"})
	void multiplication(Double arg1, Double arg2, Double arg3) {
		//Calculatrice calc = new Calculatrice();
		Double resultatObtenu = calculatrice.multiplication(arg1,arg2);
		assertThat(resultatObtenu).isEqualTo(arg3);
		//assertEquals(arg3, resultatObtenu);
	}
	
	//@Disabled("test n'est pas fait")
	@ParameterizedTest(name="Opération {0} / {1} doit être égale à {2}")
	@CsvSource({"5.0,2.0,2.5","12.0,3.0,4.0"})
	void division(Double arg1, Double arg2, Double arg3) {
		//Calculatrice calc = new Calculatrice();
		Double resultatObtenu = calculatrice.division(arg1,arg2);
		assertThat(resultatObtenu).isEqualTo(arg3);
		//assertEquals(arg3, resultatObtenu);
	}
	
	@ParameterizedTest(name="Opération {0} ** {1} doit être égale à {2}")
	@CsvSource({"5.0, 2.0,25.0","12.0,3.0,1728.0"})
	void power(Double arg1, Double arg2, Double arg3) {
		//Calculatrice calc = new Calculatrice();
		Double resultatObtenu = calculatrice.power(arg1,arg2);
		assertThat(resultatObtenu).isEqualTo(arg3);
		assertThat(resultatObtenu).isGreaterThan(0);
		assertThat(resultatObtenu).isPositive();
		//assertEquals(arg3, resultatObtenu);
	}
	
	/**@DisplayName(value = "Sous ensemble de tests")
	@Nested
	class SousEnsembleTests{
		
	}**/


}
