package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner (System.in);
		System.out.println("informe o nome: ");
		String nome = scanner.nextLine();
		Connection conexao = FabricaConexao.getconexao();
		String sql = "insert into pessoas (nome) values (?)";
		PreparedStatement stmt = conexao.prepareStatement (sql);
		stmt.setString(1, nome);
		stmt.execute();
		System.out.println("pessoa incluida com sucesso");
		
		
		
		
		scanner.close();
	}
}
