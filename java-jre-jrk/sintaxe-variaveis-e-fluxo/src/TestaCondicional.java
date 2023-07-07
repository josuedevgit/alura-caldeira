
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voce e maior de 18 anos");
			System.out.println("Seja bem-vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("pode entrar, acompanhado!");
			} else {
				System.out.println("infelizmente voce nao pode entrar");
			}
		}
		
		double salario = 3300.0;
		
		if (salario < 2600.0) {
			System.out.println("A sua alíquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350");
		} else {
			if (salario < 3750.0) {
				System.out.println("A sua alíquota é de 22,5%");
				System.out.println("Você pode deduzir até R$ 636");
			}
		}
	}
}
