/*Daniel Marques Prazeres
 * Matrícula 0050017170 */
public class CriaBike {
	
	public static void main(String[] args) {
		Bike primeiraBike = new Bike();
		primeiraBike.marca = "Caloi";
		primeiraBike.qtdMarchas = 24;
		primeiraBike.cor = "Vermelha";

		System.out.println("Bike da marca: " + primeiraBike.marca 
				+ ", com " + primeiraBike.qtdMarchas + " marchas e "
						+ "de cor: " + primeiraBike.cor);
	}
}
