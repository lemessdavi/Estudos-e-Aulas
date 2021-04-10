package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {
	
	public static void main(String[] args) {
		
		Conta[] contas= new Conta[5];
		
		ContaCorrente c1 = new ContaCorrente(12, 1);
		ContaPoupanca c2 = new ContaPoupanca(12, 2);
		
		contas[0] = c1;
		contas[1]= c2;
		
		ContaCorrente ref = (ContaCorrente) contas[0];
		
		System.out.println(contas[0].getNumero());
	}
}
