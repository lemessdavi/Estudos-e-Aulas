package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void reajustaSalario(Funcionario funcionario, Desempenho desempenho) {
		funcionario.setSalario(funcionario.getSalario().add(desempenho.reajusteEquivalente().multiply(funcionario.getSalario())));
		
	}
	
}
