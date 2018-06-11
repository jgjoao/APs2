package singleton;

public class UsaExemplo {

	
	public static void main(String[] args) {
		Exemplo a1 = Exemplo.getInstancia();
		a1.getInstancia();
		
		System.out.println(a1.getA());
		
		
	}
}
