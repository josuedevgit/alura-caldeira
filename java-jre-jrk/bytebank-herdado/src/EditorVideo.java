
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("pega aqui também");
		return super.getBonificacao() + 100.0;
	}
	
}
