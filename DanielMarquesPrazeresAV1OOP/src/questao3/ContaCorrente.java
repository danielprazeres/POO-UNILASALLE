package questao3;

/* Daniel Marques Prazeres - 0050017170 */

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
      super.saldo += valor;
  }

	
}