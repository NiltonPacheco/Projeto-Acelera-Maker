package generics;

public class Caixa <Tipo> {
	private Tipo coisa;
	public Object abrir() {
		return coisa;
	}

	public void aguardar(Tipo coisa) {
		this.coisa = coisa;
	}
	
}
