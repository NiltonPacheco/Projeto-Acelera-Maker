package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args)  {
		geraErro1();
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println("n deu erro");
		}
	}
	//excecao verificada
	static void geraErro1 () {
		 throw new RuntimeException("Ocorreu um super erro bb");
	}
	//excecao não verificada
	static void geraErro2 () throws  Exception{
		
		throw new Exception("sexo violento bb");
		
		
		}
		
}
