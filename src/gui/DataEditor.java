
package gui;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import database.DBConnection;
import net.miginfocom.swing.MigLayout;

public class DataEditor extends JFrame{
	
	private static DataEditor dataEditor = new DataEditor();
	
	private Color frameColor = new Color(32, 32, 32);
	private Color backgroundColor = new Color(25, 25, 25);
	private Color foregroundColor = new Color(255, 255, 255);
	
	private JPanel contentPane;
	private JPanel elementPanel;
	private JPanel tablePanel;
	private JPanel buttonPanel;
	private JLabel lblBearbeitungselemente;
	private JButton btnZeileHinzufuegen;
	private JButton btnZeileLoeschen;
	private JScrollPane spTable;
	private JTable table;
	private JButton btnAenderungenSpeichern;
	
	private DefaultTableModel dtm;
	private Connection con = null;
	
	
	// Method for getting the frame, because of singelton scheme
	public static DataEditor getInstance() {
		return dataEditor;
	}
	
	// Creating the frame
	private DataEditor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Datenbank-Editor");
		setBackground(frameColor);
		setForeground(foregroundColor);
		setBounds(100, 100, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBackground(backgroundColor);
		contentPane.setForeground(foregroundColor);
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[150.0,grow][300.0,grow][150.0,grow]"));
		
		// Panel for the editing elements
		elementPanel = new JPanel();
		elementPanel.setBackground(backgroundColor);
		elementPanel.setForeground(foregroundColor);
		contentPane.add(elementPanel, "cell 0 0,grow");
		elementPanel.setLayout(new MigLayout("", "[][]", "[][]"));
		
		lblBearbeitungselemente = new JLabel("Bearbeitungselemente");
		lblBearbeitungselemente.setFont(new Font("Dialog", Font.BOLD, 14));
		lblBearbeitungselemente.setForeground(foregroundColor);
		elementPanel.add(lblBearbeitungselemente, "cell 0 0");
		
		btnZeileHinzufuegen = new JButton("Zeile Hinzufügen");
		elementPanel.add(btnZeileHinzufuegen, "cell 0 1");
		
		btnZeileLoeschen = new JButton("Zeile Löschen");
		elementPanel.add(btnZeileLoeschen, "cell 1 1");
		
		// Panel for the table that resembles the database
		tablePanel = new JPanel();
		tablePanel.setBackground(backgroundColor);
		tablePanel.setForeground(foregroundColor);
		contentPane.add(tablePanel, "cell 0 1,grow");
		tablePanel.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		dtm = new DefaultTableModel(new String[][] {}, new String[] {"ID", "Name", "Datum", "Ifwt", "MNaF", "Intern",
																	 "Beschaeftigungsverhaeltnis", "Beginn", "Ende", "Extern", "E-Mail Adresse"} );
		dtm.setRowCount(0);
		
		String[] rowValue = new String[MainFrame.getDefaultTableModel().getRowCount()];
		for (int column = 0; column < MainFrame.getDefaultTableModel().getColumnCount(); column++) {
			for (int row = 0; row < MainFrame.getDefaultTableModel().getRowCount(); row++) {
				String value = MainFrame.getDefaultTableModel().getValueAt(row, column).toString();
				//rowValue = 
			}
		}
		
		
		
		spTable = new JScrollPane();
		tablePanel.add(spTable, "cell 0 0,grow");
		
		table = new JTable();
		spTable.setViewportView(table);
		
		// Loading the data from the database to the table
		/*try {
			con = DBConnection.connect();
			
			String query = "SELECT * FROM Personen";
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet resultSet = pst.executeQuery();
			
			while (resultSet.next()) {
				String id = resultSet.getString("ID");
				String name = resultSet.getString("Name");
				String vorname = resultSet.getString("Vorname");
				String datum = resultSet.getString("Datum");
				String ifwt = resultSet.getString("Ifwt");
				String manf = resultSet.getString("MNaF");
				String intern = resultSet.getString("Intern");
				String beschverh = resultSet.getString("Beschaeftigungsverhaeltnis");
				String beginn = resultSet.getString("Beginn");
				String ende = resultSet.getString("Ende");
				String extern = resultSet.getString("Extern");
				String email = resultSet.getString("E-Mail Adresse");
				
				dtm.addRow(new Object[] {id, name, vorname, datum, ifwt, manf,
						 intern, beschverh, beginn, ende, extern, email});
			}
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		
		// Panel for the update button
		buttonPanel = new JPanel();
		buttonPanel.setBackground(backgroundColor);
		buttonPanel.setForeground(foregroundColor);
		contentPane.add(buttonPanel, "cell 0 2,grow");
		buttonPanel.setLayout(new MigLayout("", "[]", "[]"));
		
		btnAenderungenSpeichern = new JButton("Änderungen Speichern");
		buttonPanel.add(btnAenderungenSpeichern, "cell 0 0");
		
		setVisible(true);
	}
	
	private static void addRow() {
		
	}
}