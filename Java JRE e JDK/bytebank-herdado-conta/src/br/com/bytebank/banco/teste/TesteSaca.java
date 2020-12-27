package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) throws SaldoInsuficienteException{
	
		Conta c = new ContaCorrente(12, 12);
		
		c.deposita(250);
		//c.saca(270);
		
		try {
			c.saca(270);
		}catch(Exception ex) {
			System.out.println("Erro");
			 ex.printStackTrace();
		}
		System.out.println(c.getSaldo());
	}
}
