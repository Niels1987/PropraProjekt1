package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class DBConnection {
	
	public static Connection connect() {
       try {
    	   Class.forName("org.sqlite.JDBC");
    	   String url = "jdbc:sqlite:database/Personen.db";
    	   Connection conn = DriverManager.getConnection(url);
    	   //System.out.println("Connection SuccesFul");
    	   JOptionPane.showMessageDialog(null, "Verbindung zur Datenbank hergestellt.");
    	   return conn;
       }catch(Exception e) {
    	   System.out.println(e.getMessage());
    	   return null;
       }
       
	}
		
}


