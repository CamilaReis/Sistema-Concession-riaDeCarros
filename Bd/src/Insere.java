import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Insere {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("Digite um id");
		String nome = JOptionPane.showInputDialog("Digite um nome");
		String idade = JOptionPane.showInputDialog("Digite uma idade");
		
		Connection con = null;
		try {
			con = ConnectionFactory.getConnection();
			String sql = "insert into cliente (id, nome, idade) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, nome);
			ps.setInt(3, Integer.parseInt(idade));
			int resultado = ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Linhas afetadas: " + resultado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
