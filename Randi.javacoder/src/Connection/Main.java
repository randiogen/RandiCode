package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException{
		Connection koneksi = Koneksi.getKoneksi(); /*
		Statement st = koneksi.createStatement();
		st.executeUpdate("UPDATE xsis_employee set nama = 'Randi' where id = 1");*/
		PreparedStatement smst = koneksi.prepareStatement("UPDATE xsis_employee set nama = ? where id = ?");
		smst.setString(1, "Asziz Jum'at");
		smst.setInt(2, 2);
		smst.executeUpdate();
		System.out.println("row instead");
	}
}
