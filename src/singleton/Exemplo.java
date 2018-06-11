package singleton;

public class Exemplo {
	
	
	public static Exemplo instancia;
	
	private String a = " teste maroto";
	
	
	
	
	
	

	 public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	// protegendo o construtor para ele nao ser chamado por nenhum local
	private Exemplo() {
		
	}

	// criando a instancia unica da classe.
	public static Exemplo getInstancia() {
		if(instancia==null)
			instancia = new Exemplo();
		return instancia;
	}
}
