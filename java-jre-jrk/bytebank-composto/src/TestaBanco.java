
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente josue = new Cliente();
		josue.nome = "Josue Silva";
		josue.cpf = "222.222.222-02";
		josue.profissao = "Programador";
		
		Conta contaDoJosue = new Conta();
		contaDoJosue.deposita(100);
		
		// associa o cliente a contaDoJosue
		contaDoJosue.titular = josue;
		System.out.println(contaDoJosue.titular.nome);
		System.out.println(contaDoJosue.titular);
		System.out.println(josue.nome);
	}
}
