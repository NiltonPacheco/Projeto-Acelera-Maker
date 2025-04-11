package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		nums.stream().map(Integer::toBinaryString ).forEach(System.out::println); // transforma pra binario
		Function<String, Integer> binarioParaInt = s-> Integer.parseInt(s,2); // volta de binario para int
	
	UnaryOperator<String> inverter = s-> new StringBuilder(s).reverse().toString(); // inverte
	nums.stream().map(Integer::toBinaryString ).map(inverter).forEach(System.out::println);
	nums.stream().map(Integer::toBinaryString ).map(binarioParaInt).forEach(System.out::println);
	}
}
