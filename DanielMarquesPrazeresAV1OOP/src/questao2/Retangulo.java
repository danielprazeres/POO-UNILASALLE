package questao2;
/* Daniel Marques Prazeres - 0050017170 */
import questao1.Quadrado;

public class Retangulo extends Quadrado {
	public void preencher() {
		System.out.println("preenchendo retangulo");
		this.desenhar();
	}
	
	public void desenhar() {
		System.out.println("Retangulo desenhado");
		System.out.println("ponto 1 (x, y)");
		this.getPonto1().imprimir();
		System.out.println("ponto 2 (x, y)");
		this.getPonto2().imprimir();
	}
	
}
