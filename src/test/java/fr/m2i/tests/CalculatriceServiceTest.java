package fr.m2i.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

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
		calculatriceService = new CalculatriceServiceImpl(calculatrice, null);
	}

	
	@Test
	public void calculate_forAddition() {
		// GIVEN
		when(calculatrice.addition(1.0, 2.0)).thenReturn(3.0);

		// WHEN
		final Double result = this.calculatriceService.calcul("+", 1.0, 2.0);
				

		// THEN
		verify(calculatrice).addition(1.0, 2.0);
		assertThat(result).isEqualTo(3.0);
	}

}
