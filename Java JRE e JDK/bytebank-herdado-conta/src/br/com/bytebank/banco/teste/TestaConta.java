package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaConta {
	public static void main(String[] args) {
		
	
	ContaCorrente cc = new ContaCorrente(12, 12);
	cc.deposita(10.0);
	
	ContaPoupanca cp = new ContaPoupanca(13, 13);
	cp.deposita(200.0);
	
	 //cp.tranfere(100, cc);
	
	System.out.println(cc);
	System.out.println(cp);

	
}
}
