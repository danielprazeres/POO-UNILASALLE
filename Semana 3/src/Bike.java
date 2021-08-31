/*Daniel Marques Prazeres
 * Matrícula 0050017170 */
public class Bike {
	String marca;
	int qtdMarchas;
	String cor;
	
	public boolean andar(double valor) {
		if(valor > 0) {
			return true;
		} return false;
	}
	
	public boolean frear(char valor) {
		if(valor == 's') {
			return true;
		}
		return false;
	}
	
}
