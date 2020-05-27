package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DBConnection {
	
	private static String url = "jdbc:sqlite:database/Personen.db";
	private static Connection con;
	
	public static Connection connect() {
       try {
    	   Class.forName("org.sqlite.JDBC");
    	   con = DriverManager.getConnection(url);
    	   //System.out.println("Connection SuccesFul");
    	   //JOptionPane.showMessageDialog(null, "Verbindung zur Datenbank hergestellt.");
    	   return con;
       }catch(Exception e) {
    	   System.out.println(e.getMessage());
    	   return null;
       }
	}
	
	// Method that returns all rows of the table where Ifwt is not null
	public static String[][] getIfwt()  {
		try {
			con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT COUNT (ID) FROM Personen WHERE NOT Ifwt IS NULL");
			int rowCount = rs.getInt(1);
			rs = stmt.executeQuery("SELECT * FROM Personen WHERE NOT Ifwt IS NULL");
			int columnCount = rs.getMetaData().getColumnCount();
			String[][] filteredTable = new String[rowCount][columnCount];
			int i = 0;
			
			while (rs.next()) {
				filteredTable[i][0] = rs.getString("ID");
				filteredTable[i][1] = rs.getString("Name");
				filteredTable[i][2] = rs.getString("Vorname");
				filteredTable[i][3] = rs.getString("Datum");
				filteredTable[i][4] = rs.getString("Ifwt");
				filteredTable[i][5] = rs.getString("MNaF");
				filteredTable[i][6] = rs.getString("Intern");
				filteredTable[i][7] = rs.getString("Beschaeftigungsverhaeltnis");
				filteredTable[i][8] = rs.getString("Beginn");
				filteredTable[i][9] = rs.getString("Ende");
				filteredTable[i][10] = rs.getString("Extern");
				filteredTable[i][11] = rs.getString("E-Mail Adresse");
				
				i++;
			}
			return filteredTable;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Method that returns all rows of the table where Ifwt equals LMN
	public static String[][] getLMN()  {
		try {
			con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT COUNT (ID) FROM Personen WHERE Ifwt='LMN'");
			int rowCount = rs.getInt(1);
			rs = stmt.executeQuery("SELECT * FROM Personen WHERE Ifwt='LMN'");
			int columnCount = rs.getMetaData().getColumnCount();
			String[][] filteredTable = new String[rowCount][columnCount];
			int i = 0;
			
			while (rs.next()) {
				filteredTable[i][0] = rs.getString("ID");
				filteredTable[i][1] = rs.getString("Name");
				filteredTable[i][2] = rs.getString("Vorname");
				filteredTable[i][3] = rs.getString("Datum");
				filteredTable[i][4] = rs.getString("Ifwt");
				filteredTable[i][5] = rs.getString("MNaF");
				filteredTable[i][6] = rs.getString("Intern");
				filteredTable[i][7] = rs.getString("Beschaeftigungsverhaeltnis");
				filteredTable[i][8] = rs.getString("Beginn");
				filteredTable[i][9] = rs.getString("Ende");
				filteredTable[i][10] = rs.getString("Extern");
				filteredTable[i][11] = rs.getString("E-Mail Adresse");
				
				i++;
			}
			return filteredTable;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Method that returns all rows of the table where Ifwt equals LMW
	public static String[][] getLMW()  {
		try {
			con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT COUNT (ID) FROM Personen WHERE Ifwt='LMW'");
			int rowCount = rs.getInt(1);
			rs = stmt.executeQuery("SELECT * FROM Personen WHERE Ifwt='LMW'");
			int columnCount = rs.getMetaData().getColumnCount();
			String[][] filteredTable = new String[rowCount][columnCount];
			int i = 0;
			
			while (rs.next()) {
				filteredTable[i][0] = rs.getString("ID");
				filteredTable[i][1] = rs.getString("Name");
				filteredTable[i][2] = rs.getString("Vorname");
				filteredTable[i][3] = rs.getString("Datum");
				filteredTable[i][4] = rs.getString("Ifwt");
				filteredTable[i][5] = rs.getString("MNaF");
				filteredTable[i][6] = rs.getString("Intern");
				filteredTable[i][7] = rs.getString("Beschaeftigungsverhaeltnis");
				filteredTable[i][8] = rs.getString("Beginn");
				filteredTable[i][9] = rs.getString("Ende");
				filteredTable[i][10] = rs.getString("Extern");
				filteredTable[i][11] = rs.getString("E-Mail Adresse");
				
				i++;
			}
			return filteredTable;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Method that returns all rows of the table where Ifwt equals LOT
	public static String[][] getLOT()  {
		try {
			con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT COUNT (ID) FROM Personen WHERE Ifwt='LOT'");
			int rowCount = rs.getInt(1);
			rs = stmt.executeQuery("SELECT * FROM Personen WHERE Ifwt='LOT'");
			int columnCount = rs.getMetaData().getColumnCount();
			String[][] filteredTable = new String[rowCount][columnCount];
			int i = 0;
			
			while (rs.next()) {
				filteredTable[i][0] = rs.getString("ID");
				filteredTable[i][1] = rs.getString("Name");
				filteredTable[i][2] = rs.getString("Vorname");
				filteredTable[i][3] = rs.getString("Datum");
				filteredTable[i][4] = rs.getString("Ifwt");
				filteredTable[i][5] = rs.getString("MNaF");
				filteredTable[i][6] = rs.getString("Intern");
				filteredTable[i][7] = rs.getString("Beschaeftigungsverhaeltnis");
				filteredTable[i][8] = rs.getString("Beginn");
				filteredTable[i][9] = rs.getString("Ende");
				filteredTable[i][10] = rs.getString("Extern");
				filteredTable[i][11] = rs.getString("E-Mail Adresse");
				
				i++;
			}
			return filteredTable;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Method that returns all rows of the table where Ifwt equals LWF
	public static String[][] getLWF()  {
		try {
			con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT COUNT (ID) FROM Personen WHERE Ifwt='LWF'");
			int rowCount = rs.getInt(1);
			rs = stmt.executeQuery("SELECT * FROM Personen WHERE Ifwt='LWF'");
			int columnCount = rs.getMetaData().getColumnCount();
			String[][] filteredTable = new String[rowCount][columnCount];
			int i = 0;
			
			while (rs.next()) {
				filteredTable[i][0] = rs.getString("ID");
				filteredTable[i][1] = rs.getString("Name");
				filteredTable[i][2] = rs.getString("Vorname");
				filteredTable[i][3] = rs.getString("Datum");
				filteredTable[i][4] = rs.getString("Ifwt");
				filteredTable[i][5] = rs.getString("MNaF");
				filteredTable[i][6] = rs.getString("Intern");
				filteredTable[i][7] = rs.getString("Beschaeftigungsverhaeltnis");
				filteredTable[i][8] = rs.getString("Beginn");
				filteredTable[i][9] = rs.getString("Ende");
				filteredTable[i][10] = rs.getString("Extern");
				filteredTable[i][11] = rs.getString("E-Mail Adresse");
				
				i++;
			}
			return filteredTable;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Method that returns all MNaF that are not null !MUSS ICH NOCH UEBERARBEITEN! Dominik
	public static String[][] getMNaF()  {
		try {
			con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT COUNT (ID) FROM Personen WHERE NOT MNaF IS NULL");
			int rowCount = rs.getInt(1);
			rs = stmt.executeQuery("SELECT * FROM Personen WHERE NOT MNaF IS NULL");
			int columnCount = rs.getMetaData().getColumnCount();
			String[][] filteredTable = new String[rowCount][columnCount];
			int i = 0;
			
			while (rs.next()) {
				filteredTable[i][0] = rs.getString("ID");
				filteredTable[i][1] = rs.getString("Name");
				filteredTable[i][2] = rs.getString("Vorname");
				filteredTable[i][3] = rs.getString("Datum");
				filteredTable[i][4] = rs.getString("Ifwt");
				filteredTable[i][5] = rs.getString("MNaF");
				filteredTable[i][6] = rs.getString("Intern");
				filteredTable[i][7] = rs.getString("Beschaeftigungsverhaeltnis");
				filteredTable[i][8] = rs.getString("Beginn");
				filteredTable[i][9] = rs.getString("Ende");
				filteredTable[i][10] = rs.getString("Extern");
				filteredTable[i][11] = rs.getString("E-Mail Adresse");
				
				i++;
			}
			return filteredTable;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//Method that returns all rows of the table where intern equals 'ja'
	public static String[][] getIntern()  {
		try {
			con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT COUNT (ID) FROM Personen WHERE Intern='Ja'");
			int rowCount = rs.getInt(1);
			rs = stmt.executeQuery("SELECT * FROM Personen WHERE Intern='Ja'");
			int columnCount = rs.getMetaData().getColumnCount();
			String[][] filteredTable = new String[rowCount][columnCount];
			int i = 0;
			
			while (rs.next()) {
				filteredTable[i][0] = rs.getString("ID");
				filteredTable[i][1] = rs.getString("Name");
				filteredTable[i][2] = rs.getString("Vorname");
				filteredTable[i][3] = rs.getString("Datum");
				filteredTable[i][4] = rs.getString("Ifwt");
				filteredTable[i][5] = rs.getString("MNaF");
				filteredTable[i][6] = rs.getString("Intern");
				filteredTable[i][7] = rs.getString("Beschaeftigungsverhaeltnis");
				filteredTable[i][8] = rs.getString("Beginn");
				filteredTable[i][9] = rs.getString("Ende");
				filteredTable[i][10] = rs.getString("Extern");
				filteredTable[i][11] = rs.getString("E-Mail Adresse");
				
				i++;
			}
			return filteredTable;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//Method that returns all rows of the table where extern equals 'ja'
		public static String[][] getExtern()  {
			try {
				con = DriverManager.getConnection(url);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT COUNT (ID) FROM Personen WHERE Extern='Ja'");
				int rowCount = rs.getInt(1);
				rs = stmt.executeQuery("SELECT * FROM Personen WHERE Extern='Ja'");
				int columnCount = rs.getMetaData().getColumnCount();
				String[][] filteredTable = new String[rowCount][columnCount];
				int i = 0;
				
				while (rs.next()) {
					filteredTable[i][0] = rs.getString("ID");
					filteredTable[i][1] = rs.getString("Name");
					filteredTable[i][2] = rs.getString("Vorname");
					filteredTable[i][3] = rs.getString("Datum");
					filteredTable[i][4] = rs.getString("Ifwt");
					filteredTable[i][5] = rs.getString("MNaF");
					filteredTable[i][6] = rs.getString("Intern");
					filteredTable[i][7] = rs.getString("Beschaeftigungsverhaeltnis");
					filteredTable[i][8] = rs.getString("Beginn");
					filteredTable[i][9] = rs.getString("Ende");
					filteredTable[i][10] = rs.getString("Extern");
					filteredTable[i][11] = rs.getString("E-Mail Adresse");
					
					i++;
				}
				return filteredTable;
				
			} catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
}