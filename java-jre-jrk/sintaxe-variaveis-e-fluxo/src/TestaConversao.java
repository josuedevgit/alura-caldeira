
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		
		int valor = (int) salario; // casting
		System.out.println(valor);
		// consigo passar um inteiro, para double, mas não o contrário
		
		long numeroGrande = 3232323232323L;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
