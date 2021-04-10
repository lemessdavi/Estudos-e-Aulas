package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1212, 3103);
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta(1212, 1293);
		segundaConta = primeiraConta;
		
		segundaConta.saldo = 50;
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
		
		
	}
}
