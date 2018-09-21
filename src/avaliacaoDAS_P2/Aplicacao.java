package avaliacaoDAS_P2;

public class Aplicacao {
	public Aplicacao(int dia, float aliquota) {
		this.dia = dia;
		this.aliquota = aliquota;
	}

	private int dia;
	private float aliquota;
	
	public float getDia() {
		return dia;
	}
	public float getAliquota() {
		return aliquota;
	}
}
