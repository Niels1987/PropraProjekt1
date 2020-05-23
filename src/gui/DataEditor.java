
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import database.DBConnection;

public class DataEditor implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel lblName = new JLabel("Name");
	JLabel lblVorname = new JLabel("Vorname");
	JLabel lblDatum = new JLabel("Datum");
	JLabel lblIfwt = new JLabel("Ifwt");
	JLabel lblMnaF = new JLabel("MnaF");
	JLabel lblIntern = new JLabel("Intern");
	JLabel lblBeschaeftigungsverhaeltnis = new JLabel("Beschäftigungsverhältnis");
	JLabel lblBeginn = new JLabel("Beginn");
	JLabel lblEnde = new JLabel("Ende");
	JLabel lblExtern = new JLabel("Extern");
	JLabel lbleMailAdresse = new JLabel("E-Mail Adresse");
	JLabel lblallgUnt = new JLabel("Allgemeine Unterweisung");
	JLabel lblLaboreinrichtung = new JLabel("Laboreinrichtung");
	JLabel lblGefahrstoffe = new JLabel("Gefahrstoffe");
	
	JTextField txtName = new JTextField();
	JTextField txtVorname = new JTextField();
	JTextField txtDatum = new JTextField();
	JTextField txtIfwt= new JTextField();
	JTextField txtMNaF = new JTextField();
	JTextField txtIntern = new JTextField();
	JTextField txtBeschaeftigungsverhältnis = new JTextField();
	JTextField txtBeginn = new JTextField();
	JTextField txtEnde = new JTextField();
	JTextField txtExtern = new JTextField();
	JTextField txteMailAdresse = new JTextField();
	JTextField txtallgUnt = new JTextField();
	JTextField txtLaboreinrichtung = new JTextField();
	JTextField txtGefahrstoffe= new JTextField();
	JTextArea txtAreaAllgUnt = new JTextArea();
	JTextArea txtAreaLabor = new JTextArea();
	JTextArea txtAreaGefahrstoffe = new JTextArea();
	JButton btnSave = new JButton("Speichern!");
	
	
	public DataEditor() {
		//Zum Daten bearbeiten muss eine Zeile in der Tabelle angeklickt werden, das wird versucht.
		//wenn keine angeklickt wurde, ->Exception
		
		try {
		Vector v = ((DefaultTableModel) MainFrame.table.getModel()).getDataVector().elementAt(MainFrame.table.getSelectedRow());
		
		txtName.setText(v.get(1).toString());
		txtVorname.setText(v.get(2).toString());
		txtDatum.setText(v.get(3).toString());
		txtIfwt.setText(v.get(4).toString());
		txtMNaF.setText(v.get(5).toString());
		txtIntern.setText(v.get(6).toString());
		txtBeschaeftigungsverhältnis.setText(v.get(7).toString());
		txtBeginn.setText(v.get(8).toString());
		txtEnde.setText(v.get(9).toString());
		txtExtern.setText(v.get(10).toString());
		txteMailAdresse.setText(v.get(11).toString());
		
		//hier muss ich noch schauen(Fiti)
		//txtAreaAllgUnt.setText();
		//txtAreaLabor.setText();
		//txtGefahrstoffe.setText();
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Es wurde keine Zeile in der Tabelle zum Bearbeiten ausgesucht!");
		}
		
		
		initialize();
		
		
		
	}
	
	
	
	
	public void initialize() {
		frame.setSize(1900, 1400);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		lblName.setBounds(20, 20, 100, 70);
		lblVorname.setBounds(500, 20, 100, 70);
		lblDatum.setBounds(20, 100, 100, 70);
		lblIfwt.setBounds(500, 100, 100, 70);
		lblMnaF.setBounds(20, 200, 100, 70);
		lblIntern.setBounds(500, 200, 100, 70);
		lblBeschaeftigungsverhaeltnis.setBounds(20, 300, 170, 70);
		lblBeginn.setBounds(500, 300, 100, 70);
		lblEnde.setBounds(20, 400, 100, 70);
		lblExtern.setBounds(500, 400, 100, 70);
		lbleMailAdresse.setBounds(20, 500, 100, 70);
		txtName.setBounds(200, 30, 140, 50);
		txtDatum.setBounds(200, 110, 140, 50);
		txtMNaF.setBounds(200, 210, 140, 50);
		txtBeschaeftigungsverhältnis.setBounds(200, 310, 170, 50);
		txtEnde.setBounds(200, 405, 140, 50);
		txteMailAdresse.setBounds(200, 505, 180, 50);
		txtVorname.setBounds(600, 30, 140, 50);
		txtIfwt.setBounds(600, 110, 140, 50);
		txtIntern.setBounds(600, 205, 140, 50);
		txtBeginn.setBounds(600, 310, 140, 50);
		txtExtern.setBounds(600, 405, 140, 50);
		lblallgUnt.setBounds(900, 10, 180, 70);
		txtAreaAllgUnt.setBounds(900, 60, 400, 150);
		lblLaboreinrichtung.setBounds(900, 240, 180, 70);
		txtAreaLabor.setBounds(900, 290, 400, 150);
		lblGefahrstoffe.setBounds(900, 470, 180, 70);
		txtAreaGefahrstoffe.setBounds(900, 520, 400, 150);
		btnSave.setBounds(390, 650, 170, 70);
		
		
		
		//lblallgUnt.setBounds(300, 500, 100, 70);
		//lblLaboreinrichtung.setBounds(x, y, width, height);
		//lblGefahrstoffe.setBounds(x, y, width, height);
		panel.add(lblName);
		panel.add(lblVorname);
		panel.add(lblDatum);
		panel.add(lblIfwt);
		panel.add(lblMnaF);
		panel.add(lblIntern);
		panel.add(lblBeschaeftigungsverhaeltnis);
		panel.add(lblBeginn);
		panel.add(lblEnde);
		panel.add(lblExtern);
		panel.add(lbleMailAdresse);
		panel.add(txtName);
		panel.add(txtDatum);
		panel.add(txtMNaF);
		panel.add(txtBeschaeftigungsverhältnis);
		panel.add(txtEnde);
		panel.add(txteMailAdresse);
		panel.add(txtVorname);
		panel.add(txtIfwt);
		panel.add(txtIntern);
        panel.add(txtBeginn);
        panel.add(txtExtern);
        panel.add(lblallgUnt);
        panel.add(txtAreaAllgUnt);
        panel.add(lblLaboreinrichtung);
        panel.add(txtAreaLabor);
        panel.add(lblGefahrstoffe);
        panel.add(txtAreaGefahrstoffe);
        panel.add(btnSave);
		frame.setVisible(true);
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = txtName.getText();
		String vorname = txtVorname.getText();
		String datum = txtDatum.getText();
		String ifwt = txtIfwt.getText();
		String mnaf = txtMNaF.getText();
		String intern = txtIntern.getText();
		String beschaeftigungsv = txtBeschaeftigungsverhältnis.getText();
		String beginn = txtBeginn.getText();
		String ende = txtEnde.getText();
		String extern = txtExtern.getText();
		String email = txteMailAdresse.getText();
		String allgUnt = txtAreaAllgUnt.getText();
		String labor = txtAreaLabor.getText();
		String gefahrstoffe = txtAreaGefahrstoffe.getText();
		
		//Die Daten werden zuerst in der Datenbank abgeändert und dann schreibe ich noch eine Funktion die die Tabelle refresht (Fiti)
		
		//DBConnection.update(name,vorname, datum,ifwt,mnaf,intern,beschaeftigungsv,beginn,ende,extern,email, allgUnt, labor, gefahrstoffe);
		
	}

}