package questao1;
/* Daniel Marques Prazeres - 0050017170 */
public class Ponto2D {
	private int x;
	private int y;
	
	protected Ponto2D() {
		
	}
	
	public Ponto2D(int x, int y) {
		this.setX(x);
		this.setY(y);	
	}
	
	public void imprimir() {
		System.out.println("coordenadas x, y = (" + getX() + ", "
				+ getY() + ")");
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
