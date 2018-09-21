package avaliacaoDAS_P2;

public class Calculadora {
	public static Aplicacao rendimento(float valorEntrada) {
		
		if (valorEntrada > 0) {
			return new Aplicacao(60, 22.5f);
		}else 
			return new Aplicacao(0, 0);
		
	}
}
