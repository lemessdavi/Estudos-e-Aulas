package br.com.bytebank.banco.modelo;
public class CalculadorImposto {
	private double totalImposto; 

	
	public double getValor_Imposto(){
		return this.totalImposto;
	}
	
	public void registra(Tributavel t) {
		this.totalImposto += t.getValorImposto();
	}
	
	
	// 	return super.getValor_Imposto();

}
