
public class SistemaInterno {
	
	private int senha = 2222;
 
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("Pode entrar nesse sistema!");
		} else {
			System.out.println("Nao pode entrar nesse sistema!");
		}
	}
}
