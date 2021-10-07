package Questao2;
/* Daniel Marques Prazeres - 0050017170 */

import java.util.ArrayList;
import Questao1.Funcionario;

public class UtilFuncionario {
	public void ListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		
		for (Funcionario f : listaFuncionarios) {
			System.out.println("O" + f.getClass().toString().replace("class", "") +
				 ": " + f.getNome() + " - Salário: R$" + f.calculaSalario());
		}
		
		
	}

}
