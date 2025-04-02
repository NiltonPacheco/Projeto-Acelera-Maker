package Classe;

public class TesteConstrutor {
	int a;
	int b;
	public TesteConstrutor(int a,int b){
		this.a = a;
		this.b = b;
		
	}
	public static void main(String[] args) {
		
		TesteConstrutor teste1 = new TesteConstrutor (3,4);
		TesteConstrutor teste2 = new TesteConstrutor (5,6);
		System.out.printf("%d %d " , teste1.a, teste1.b);
		System.out.printf("%d %d", teste2.a, teste2.b);
	}
	
}
