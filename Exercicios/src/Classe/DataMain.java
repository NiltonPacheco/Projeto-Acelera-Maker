package Classe;

public class DataMain {
	public static void main(String[] args) {
		Data d1 = new Data(06,06,2003);
		Data d2 = new Data();
		d2.dia = 29;
		d2.ano= 2004;
		d2.mes = 05;
		Data d3 = new Data();
		
		System.out.println(d1.dataformatada());
		System.out.print(d2.dataformatada());
		System.out.print(d3.dataformatada());
	}
}
