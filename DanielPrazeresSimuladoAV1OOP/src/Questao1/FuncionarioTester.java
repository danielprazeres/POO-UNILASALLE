package Questao1;

/* Daniel Marques Prazeres - 0050017170 */
public class FuncionarioTester {

		public static void main(String[] args) {
			FuncionarioVendedor fV1 = new FuncionarioVendedor("FuncionarioV1", "1");
			
			fV1.setQuantidadeVendida(8);
			fV1.setTaxaComissao(10);
			
			System.out.println("O vendedor " + fV1.getNome() + ", receberá o salário de: "
					+ fV1.calculaSalario());
			
			FuncionarioVendedor fV2 = new FuncionarioVendedor("FuncionarioV2", "2");
			
			fV2.setQuantidadeVendida(12);
			fV2.setTaxaComissao(15);
			
			System.out.println("O vendedor " + fV2.getNome() + ", receberá o salário de:"
					+ fV2.calculaSalario());
			
			//Horista
			
			FuncionarioHorista fH1 = new FuncionarioHorista("FuncionarioH1", "11");
			fH1.setHorasTrabalhadas(8);
			fH1.setValorHora(15.90);
			
			System.out.println("O horista " + fH1.getNome() + ", receberá o salário de: "
					+ fH1.calculaSalario());
			
			FuncionarioHorista fH2 = new FuncionarioHorista("FuncionarioH2", "22");
			fH2.setHorasTrabalhadas(8);
			fH2.setValorHora(5.90);
			
			System.out.println("O horista " + fH2.getNome() + ", receberá o salário de: "
					+ fH2.calculaSalario());
			
		}
}
