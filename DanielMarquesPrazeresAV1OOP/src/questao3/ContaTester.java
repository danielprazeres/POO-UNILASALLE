package questao3;

/* Daniel Marques Prazeres - 0050017170 */
public class ContaTester {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		System.out.println("CC: " + cc.getSaldo());

		if(cc.saca(120.0)) {
			System.out.println("CC: " + cc.getSaldo());
		} 
		
		System.out.println("Você não possui saldo sacar.");



	}


}
