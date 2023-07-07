
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println();
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		// boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("O valor de acompanhado é = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else  {
			System.out.println("infelizmente não pode entrar");
		}
	}
}
