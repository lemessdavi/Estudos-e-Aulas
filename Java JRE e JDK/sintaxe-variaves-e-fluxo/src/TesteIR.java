
public class TesteIR {

	public static void main(String[] args) {

		double salario = 1920;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		} else {
			if (salario >= 2800.01 && salario <= 3751.0) {
				System.out.println("o IR é de 15% e pode deduzir R$ 350");
			} else {
				if (salario >= 3751.01 && salario <= 4664.00) {
					System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
				} else {
					System.out.println("Verifique se o valor digitado está correto.");
				}

				// melhor de fazer, cpa:
				/*
				 * if(salario >= 1900.0 && salario <= 2800.0) {
				 * System.out.println("A sua aliquota é de 7%");
				 * System.out.println("Você pode deduzir até R$ 142"); } else if(salario >=
				 * 2800.01 && salario <= 3751.0) {
				 * System.out.println("A sua aliquota é de 15%");
				 * System.out.println("Você pode deduzir até R$ 350"); } else if(salario >=
				 * 3751.01 && salario <= 4664.0) {
				 * System.out.println("A sua aliquota é de 22.5%");
				 * System.out.println("Você pode deduzir até R$ 636"); }
				 */
			}
		}
	}
}