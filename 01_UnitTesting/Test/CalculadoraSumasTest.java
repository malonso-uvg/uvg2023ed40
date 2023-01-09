import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author moises.alonso
 *
 */
class CalculadoraSumasTest {

	ICalculator miCalculadora = new CalculadoraSumas();
	
	@Test
	void SumaPositivosTest() {
		int result = miCalculadora.add(3, 5);
		assertEquals(8, result);
	}
	
	@Test
	void SumaPrimeroNegativoTest() {
		int result = miCalculadora.add(-3, 5);
		assertEquals(2, result);
	}

}
