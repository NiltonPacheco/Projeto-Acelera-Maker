package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import execessao.ExplosaoException;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private int minas;
    private final List<Campo> campos = new ArrayList<Campo>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
        gerarCampos();
        associarOsVizinhos();
        sortearMinas();
    }

    public void abrir(int linha, int coluna) {
       try {
    	   campos.stream()
           .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
           .findFirst().ifPresent(c -> c.abrir());
       }catch (ExplosaoException e) {
    	   campos.forEach(c -> c.setAberto(true));
    	   throw e;
       }
    }

    public void alternarMarcacao(int linha, int coluna) {
        campos.stream()
              .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
              .findFirst().ifPresent(c -> c.alternarMarcacao());
    }

    private void gerarCampos() {
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                campos.add(new Campo(linha, coluna));
            }
        }
    }

    private void associarOsVizinhos() {
        for (Campo c1 : campos) {
            for (Campo c2 : campos) {
                // Verificando se c2 é um vizinho de c1
                if (Math.abs(c1.getLinha() - c2.getLinha()) <= 1 &&
                    Math.abs(c1.getColuna() - c2.getColuna()) <= 1 && 
                    !c1.equals(c2)) {
                    c1.adicionarVizinho(c2);
                }
            }
        }
    }

    private void sortearMinas() {
        long minasArmadas = 0;
        Predicate<Campo> minado = c -> c.isMinado();
        do {
            
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(minado).count();
        } while (minasArmadas < minas);
    }

    public boolean objetivoAlcancado() {
        return campos.stream().allMatch(Campo::objetivoAlcancado);
    }

    public void reiniciar() {
        campos.forEach(Campo::reiniciar);
        sortearMinas();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ");
      
        for (int c = 0; c< colunas;c++) {
        	sb.append(" ");
            sb.append(c);
            sb.append(" ");
        }
        sb.append("\n ");
        
        int i = 0;
        for (int l = 0; l < linhas; l++) {
        	sb.append(l);
        	sb.append("");
            for (int c = 0; c < colunas; c++) {
                sb.append(" ");
                sb.append(campos.get(i).toString()); // Aqui chama o toString de cada campo, que deve estar correto.
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
