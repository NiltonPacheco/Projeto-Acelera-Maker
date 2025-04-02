package Classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data () {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	String dataformatada () {
		return String.format("%d/%d/%d\n", dia,mes,ano);
	}
}
