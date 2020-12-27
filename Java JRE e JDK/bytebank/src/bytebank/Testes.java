package bytebank;

public class Testes {

	public static void main(String[] args) {
		
	
		Conta contaDoLemes = new Conta(293, 1239);
		
		contaDoLemes.titular = new Cliente();
		
		contaDoLemes.titular.nome = "Lemes";
}

}