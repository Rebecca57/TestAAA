package fr.m2i.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.m2i.Models.CalculatriceModel;
import fr.m2i.Models.Operation;
import fr.m2i.logique.Calculatrice;
import fr.m2i.services.CalculatriceServiceImpl;
import fr.m2i.services.CalculatriceService;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatriceServiceTest {
	@Mock
	Calculatrice calculatrice;
	
	CalculatriceService calculatriceService;
	
	
	@BeforeEach
	public void init() {
		calculatriceService = new CalculatriceServiceImpl(calculatrice);
	}
	
	@Test
	public void calculate_forAddition() throws Exception {
		// GIVEN
		final Random r = new Random();
		when(calculatrice.addition(any(Double.class), any(Double.class))).thenReturn(3.0);

		// WHEN
		final Double result = this.calculatriceService.calcul(new CalculatriceModel(r.nextDouble(), r.nextDouble(),Operation.ADDITION)).getResultat();
				

		// THEN
		verify(calculatrice).addition(any(Double.class), any(Double.class));
		assertThat(result).isEqualTo(3.0);
	}
	
	
	@Test
	public void calculate_forSoustraction() throws Exception {
		// GIVEN
		when(calculatrice.soustraction(5.0, 2.0)).thenReturn(3.0);

		// WHEN
		final Double result = this.calculatriceService.calcul(new CalculatriceModel( 5.0, 2.0, Operation.SOUSTRACTION)).getResultat();
				

		// THEN
		verify(calculatrice).soustraction(5.0, 2.0);
		assertThat(result).isEqualTo(3.0);
	}
	
	@Test
	public void calculate_forMultiplication() throws Exception {
		// GIVEN
		when(calculatrice.multiplication(1.0, 2.0)).thenReturn(2.0);

		// WHEN
		final Double result = this.calculatriceService.calcul(new CalculatriceModel( 1.0, 2.0, Operation.MULTIPLICATION)).getResultat();
				

		// THEN
		verify(calculatrice).multiplication(1.0, 2.0);
		assertThat(result).isEqualTo(2.0);
	}
	
	@Test
	public void calculate_forDivision() throws Exception {
		// GIVEN
		when(calculatrice.division(1.0, 2.0)).thenReturn(0.5);

		// WHEN
		final Double result = this.calculatriceService.calcul(new CalculatriceModel( 1.0, 2.0,Operation.DIVISION)).getResultat();
				

		// THEN
		verify(calculatrice).division(1.0, 2.0);
		assertThat(result).isEqualTo(0.5);
	}
	
	@Test
	public void calculate_forPower() throws Exception {
		// GIVEN
		when(calculatrice.power(2.0, 2.0)).thenReturn(4.0);

		// WHEN
		final Double result = this.calculatriceService.calcul(new CalculatriceModel( 2.0, 2.0,Operation.PUISSANCE)).getResultat();
				

		// THEN
		verify(calculatrice).power(2.0, 2.0);
		assertThat(result).isEqualTo(4.0);
	}
	


}
