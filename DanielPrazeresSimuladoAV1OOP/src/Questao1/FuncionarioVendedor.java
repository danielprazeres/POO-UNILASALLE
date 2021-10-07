package Questao1;

/* Daniel Marques Prazeres - 0050017170 */
public class FuncionarioVendedor extends Funcionario{

	private int quantidadeVendida;
	private double taxaComissao;
	
	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}
	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
	public double getTaxaComissao() {
		return taxaComissao;
	}
	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}
	
	public FuncionarioVendedor(String nome, String matricula) {
		super(nome, matricula);
	}
	
	@Override
	public double calculaSalario() {
		return this.getQuantidadeVendida()*this.getTaxaComissao();
	}
	
	
}
