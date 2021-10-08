package questao1;
/* Daniel Marques Prazeres - 0050017170 */
public class Quadrado {
	private Ponto2D ponto1;
	private Ponto2D ponto2;
	
	public void desenhar() {
		System.out.println("Quadrado desenhado");
		System.out.println("ponto1 (x, y)");
		this.ponto1.imprimir();
		System.out.println("ponto2 (x, y)");
		this.ponto2.imprimir();
	}
	
	public Ponto2D getPonto1() {
		return ponto1;
	}
	
	public void setPonto1(Ponto2D ponto1) {
		this.ponto1 = ponto1;
	}
	
	public Ponto2D getPonto2() {
		return ponto2;
	}
	
	public void setPonto2(Ponto2D ponto2) {
		this.ponto2 = ponto2;
	}
}
