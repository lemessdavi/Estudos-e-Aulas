package salao.lepon;

public class Cliente {
	private String nome;
	private int cpf;
	private String endereco;
	private String contato;
	private int  nascimento;
	
	public Cliente(String nome, String contato, int cpf, String endereco) {
		this.nome = nome;
		this.contato = contato;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public int getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getContato() {
		return contato;
	}
	
	
}
