import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	
	private static final String url = "jdbc:mysql://localhost/testando";
	private static final String usuario = "root";
	private static final String senha = "";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, usuario, senha);
	}
	
}
