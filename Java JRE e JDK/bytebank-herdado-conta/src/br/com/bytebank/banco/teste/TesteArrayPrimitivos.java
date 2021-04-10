package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {
	public static void main(String[] args) {
		
		/*
		 * int[] idades = new int[5];
		 * 
		 * idades[0] = 12; idades[1] = 14; idades[2] = 43; idades[3] = 65; idades[4] =
		 * 13;
		 * 
		 * System.out.println(idades[3]); System.out.println(idades.length);
		 */
		
		int[] idades = new int[5];

		
		for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
              System.out.println(idades[i]);
        }
		
		
	}
}
