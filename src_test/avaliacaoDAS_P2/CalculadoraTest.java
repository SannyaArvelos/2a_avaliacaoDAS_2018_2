package avaliacaoDAS_P2;



import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
		Aplicacao resultado = Calculadora.rendimento(1000);
		
		assertEquals(resultado.getDia(), 0f);
		assertEquals(resultado.getAliquota(), 0f);
	}

}
