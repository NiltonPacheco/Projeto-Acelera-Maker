package o.desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	Cliente (String nome) {
		this.nome = nome;
	}
	ArrayList<Compra> compras = new ArrayList<Compra>();
	double obterValorTotal () {
		double total = 0;
			for ( Compra compra: compras) {
				total+= compra.obterValorTotal(); 
			}
		return total;
	
	}
 }
