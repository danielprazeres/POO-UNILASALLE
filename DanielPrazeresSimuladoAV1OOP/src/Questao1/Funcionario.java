package Questao1;

/* Daniel Marques Prazeres - 0050017170 */

public abstract class Funcionario extends Pessoa {

		private String matricula;
		private Funcionario gerente;
		
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public Funcionario getGerente() {
			return gerente;
		}
		public void setGerente(Funcionario gerente) {
			this.gerente = gerente;
		}
		
		public abstract double calculaSalario();
		
		public Funcionario(String nome, String matricula) {
			super(nome);
			this.setMatricula(matricula);;
		}
		
		@Override
		public int compareTo(Funcionario f) {
			return this.calculaSalario() < f.calculaSalario() ? -1 : this.calculaSalario() > f.calculaSalario()  ? 1 : 0;
		}
}
