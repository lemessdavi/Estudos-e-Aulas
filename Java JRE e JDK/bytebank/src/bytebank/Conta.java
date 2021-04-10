package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	private static int total =0;
	
	
	public Conta(int agencia,int numero){
		this.agencia= agencia;
		this.numero = numero;
		total ++;
		System.out.println("Conta Criada");
		System.out.println("Número total de contas: " + total);
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean tranfere(double valor, Conta destino) {
		if(saca(valor)){
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public static int getTotal() {
		return total;
	}
}
