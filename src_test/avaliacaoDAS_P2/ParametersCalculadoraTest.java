package avaliacaoDAS_P2;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParametersCalculadoraTest {
	public ParametersCalculadoraTest(int dia, float aliquota, float valorEntrada) {
		this.dia = dia;
		this.aliquota = aliquota;
		this.valorEntrada = valorEntrada;
	}
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{60, 22.5f, 100f},
			{120, 22.5f, 100f},
			{240, 20f, 100f},
			{420, 17.5f, 100f},
			{502, 17.5f, 100f}
		});
	}
	
	private int dia;
	private float aliquota;
	private float valorEntrada;
	
	@Test
	public void test() throws Exception {
		Aplicacao resultado = Calculadora.rendimento(100);
		
		assertEquals(resultado.getDia(), 0f);
		assertEquals(resultado.getAliquota(), 0f);

	}

}
