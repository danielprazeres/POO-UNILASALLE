package questao2;
/* Daniel Marques Prazeres - 0050017170 */
import questao1.Ponto2D;
import java.util.Scanner;

public class DesenhaRetangulo {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quais as coordenadas X e Y do retângulo 1?");
		Ponto2D p12D = new Ponto2D(scanner.nextInt(), scanner.nextInt());
		System.out.println("Quais as coordenadas X e Y do retângulo 2?");
		Ponto2D p22D = new Ponto2D(scanner.nextInt(), scanner.nextInt());
		
		Retangulo retangulo = new Retangulo();
		retangulo.setPonto1(p12D);
		retangulo.setPonto2(p22D);
		retangulo.desenhar();
	}
	
}
