
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
	
		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();

		conta.setTitular(paulo);
	}
}
