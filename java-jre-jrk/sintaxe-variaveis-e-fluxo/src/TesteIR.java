
public class TesteIR {
	public static void main(String[] args) {
		double salario = 1900.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Seu imposto de renda é de 7.5%");
			System.out.println("Dudução de declaração é de R$ 142");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
				System.out.println("Seu imposto de renda é de 15%");
				System.out.println("Dedução de declaração é de R$ 350");
		} else if (salario >= 3751.01 && salario <= 4664.0) {
				System.out.println("Seu imposto de renda é de 22.5%");
				System.out.println("pode deduzir declaração de R$ 636");
		}

	}
}