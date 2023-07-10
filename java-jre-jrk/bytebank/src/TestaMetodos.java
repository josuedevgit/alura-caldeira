public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaDoJosue = new Conta();
		contaDoJosue.saldo = 100;
		contaDoJosue.deposita(50);
		System.out.println(contaDoJosue.saldo);

		boolean conseguiuRetirar = contaDoJosue.saca(20);
		System.out.println(contaDoJosue.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoJosue);
		if(sucessoTransferencia) {
			System.out.println("feito o carreto!");
		} else {
			System.out.println("POBRE!");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoJosue.saldo);
	}
}
