package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conexao;

public class TestandoConexao {

	public static void main(String[] args) {
		
		try(Conexao con = new Conexao()){
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu merda na conexao");
		}
	}

}
