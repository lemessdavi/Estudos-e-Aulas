
public class TestaMultiplos {
	public static void main(String[] args) {
		for (int multiplicador = 0; multiplicador <= 100; multiplicador++) {
			int resultado = multiplicador * 3;
			if (resultado % 3 == 0){
				System.out.print(resultado + ", ");	
			}
		}
	}
}
