package generics;

public class CaixaObjeto {
	private Object coisa;

	public Object abrir() {
		return coisa;
	}

	public void aguardar(Object coisa) {
		this.coisa = coisa;
	}
	
}
