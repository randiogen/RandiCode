package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
	private static Connection connect;
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static String jdbc = "jdbc:oracle:thin:";
	private static String host = "@localhost:";
	private static String port = "1521:";
	private static String SID = "xe";
	private static String database = "Oracle_Connection";
	private static String url = jdbc + host + port +SID;
	private static String username = "hr";
	private static String password = "hr";
	
	public static Connection getKoneksi() throws SQLException{
		if (connect == null) {
			try {
				Class.forName(driverName);
				System.out.println("Class Driver has found");
				try {
					connect = DriverManager.getConnection(url,username,password);
					System.out.println("Connection Database Success");
				} catch (SQLException se) {
					// TODO: handle exception
					System.out.println("Connection Database Failed " + se);
					System.exit(0);
				}
			} catch (ClassNotFoundException cnfe) {
				// TODO: handle exception
				System.out.println("Class Driver hasn't found , something wrong on : "+ cnfe);
				System.exit(0);
			}
		}
		return connect;
	}
}
