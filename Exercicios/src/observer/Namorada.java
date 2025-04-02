package observer;

public class Namorada implements ObservadorChegadaAniversariante {
	public void chegou (EventoChegadaAniversariante evento) {
		System.out.println("Gente ele chegou!!!");
		System.out.println("Apagar luzes");
		System.out.println("esperar...");
		System.out.println("SURPRESAAAA!!!");
	}
}
