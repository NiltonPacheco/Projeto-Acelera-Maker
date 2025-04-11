package visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import execessao.ExplosaoException;
import execessao.SairException;
import modelo.Tabuleiro;

public class TabuleiroConsole {
	
	private Tabuleiro tabuleiro;
	private Scanner scanner = new Scanner (System.in);
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		executarJogo ();
	}

	private void executarJogo () {
		try {
			boolean continuar = true;
			while (continuar) {
				cicloDoJogo();
				
				System.out.println("outra partida? (S/n)");
				String resposta = scanner.nextLine();
				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("adeus!");
		} finally {
			scanner.close();
		}
	}

	private void cicloDoJogo() {
		try {
			while (!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				String digitado = capturarValor("digite (X,Y): ");
				Iterator <Integer> xy = Arrays.stream(digitado.split(","))
				.map(e -> Integer.parseInt(e.trim())).iterator();
				digitado = capturarValor("1 - Abrir ou 2 - (des) marcar: ");
				if ("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				}else if ("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
				}
			}
			System.out.println("voce ganhou! ");
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("voce perdeu!");
		}
		
	}
	private String capturarValor (String texto) {
		System.out.println(texto);
		String digitado = scanner.nextLine();
		if ("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		return digitado;
	}
}
