/*Daniel Marques Prazeres
 * Matrícula 0050017170 */
public class BikeTester {
	
	public static void main(String[] args) {
		Bike bikeDoDaniel = new Bike();
		bikeDoDaniel.marca = "Caloi";
		bikeDoDaniel.qtdMarchas = 24;
		bikeDoDaniel.cor = "preta";
		
		bikeDoDaniel.andar(50);
		bikeDoDaniel.frear('S');
		
		if(bikeDoDaniel.andar(50)) {
			System.out.println("Bike da marca: " + bikeDoDaniel.marca 
					+ ", com " + bikeDoDaniel.qtdMarchas + " marchas e "
							+ "de cor: " + bikeDoDaniel.cor 
							+ " foi aprovada no teste de andar.");
		} else {
			System.out.println("Bike da marca: " + bikeDoDaniel.marca 
					+ ", com " + bikeDoDaniel.qtdMarchas + " marchas e "
							+ "de cor: " + bikeDoDaniel.cor 
							+ " foi reprovada no teste de andar.");
		}
		
		if(bikeDoDaniel.frear('s')) {
			System.out.println("Bike da marca: " + bikeDoDaniel.marca 
					+ ", com " + bikeDoDaniel.qtdMarchas + " marchas e "
							+ "de cor: " + bikeDoDaniel.cor 
							+ " foi aprovada no teste de frenagem.");
		} else {
			System.out.println("Bike da marca: " + bikeDoDaniel.marca 
					+ ", com " + bikeDoDaniel.qtdMarchas + " marchas e "
							+ "de cor: " + bikeDoDaniel.cor 
							+ " foi reprovada no teste de frenagem.");
		}
		
	}
}
