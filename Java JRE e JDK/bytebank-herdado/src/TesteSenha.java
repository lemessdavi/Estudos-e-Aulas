
public class TesteSenha {
	public static void main(String[] args) {
		
		Gerente bruno = new Gerente();
		bruno.setSenha(222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(bruno);
	}
}
