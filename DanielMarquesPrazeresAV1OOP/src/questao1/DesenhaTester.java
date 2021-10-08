package questao1;
/* Daniel Marques Prazeres - 0050017170 */
import java.util.Scanner;

public class DesenhaTester {
	public static void main(String[] args) {
		

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quais as coordenadas X e Y do quadrado 1?");
		Ponto2D p12D = new Ponto2D(scanner.nextInt(), scanner.nextInt());
		System.out.println("Quais as coordenadas X e Y do quadrado 2?");
		Ponto2D p22D = new Ponto2D(scanner.nextInt(), scanner.nextInt());
		
		Quadrado square = new Quadrado();
		square.setPonto1(p12D);
		square.setPonto2(p22D);
		square.desenhar();
	}

}
