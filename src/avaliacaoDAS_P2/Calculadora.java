package avaliacaoDAS_P2;

public class Calculadora {
	public static Aplicacao rendimento(float valorEntrada) {
		
		if (valorEntrada > 0) {
			return new Aplicacao(180, 22.5f);
		}else if (valorEntrada > 0) {
			return new Aplicacao(360, 20f);
		}else if (valorEntrada > 0) {
			return new Aplicacao(720, 17.5f);
		}else {
			return new Aplicacao(721, 15f);
		}
	}
}
