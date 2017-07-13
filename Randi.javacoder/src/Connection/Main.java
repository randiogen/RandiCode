package Connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException{
		Connection koneksi = Koneksi.getKoneksi(); 
		Statement st = koneksi.createStatement();
		st.executeUpdate("INSERT INTO xsis_employee VALUES (3, 'Asziz', 'Sragen', 3000)");
		System.out.println("row instead");
	}
}
