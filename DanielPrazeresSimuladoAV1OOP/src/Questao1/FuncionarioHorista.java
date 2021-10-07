package Questao1;

/* Daniel Marques Prazeres - 0050017170 */
public final class FuncionarioHorista extends Funcionario{

	private int horasTrabalhadas;
	private double valorHora;
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public FuncionarioHorista(String nome, String matricula) {
		super(nome, matricula);
	}
	
	@Override
	public double calculaSalario() {
		return this.getValorHora()*this.getHorasTrabalhadas();
	}
	
}
