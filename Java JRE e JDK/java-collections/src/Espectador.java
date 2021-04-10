
public class Espectador {
	private String nome;
	private int numeroIngresso;
	
	public Espectador(String nome, int numeroIngresso) {
		if(nome == null ) {
			throw new NullPointerException("Nome e Ingresso não pode ser nulo");
		}
		this.nome = nome;
		this.numeroIngresso = numeroIngresso;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroIngresso() {
		return numeroIngresso;
	}
	
	@Override
	public String toString() {
		return "Espectador: " + this.getNome() + ", Número do ingresso: " +this.getNumeroIngresso();
	}
	
	@Override
	public boolean equals(Object obj) {
		Espectador espec = (Espectador) obj;
		return this.nome.equals(espec.nome);
	}
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
