package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
		public static void main(String[] args) {
			
		
		JFrame janela = new JFrame ("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // cria um botão para fechar
		janela.setSize(600,200);
		janela.setLayout(new FlowLayout()); // estiliza um botao
		janela.setLocationRelativeTo(null); // centraliza na tela do pc
		
		
		JButton botao = new JButton("Clicar!"); // criacao de um botao
		janela.add(botao);
		botao.addActionListener(null);
		
		
		
		
		janela.setVisible(true);
		
		
		
		}
}
