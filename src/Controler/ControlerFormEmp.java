package Controler;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Views.ViewAjouterEmployer;
import Views.ViewUpdateEmployer;
import Views.TableEmployer;




public class ControlerFormEmp implements ActionListener {
	private TableEmployer home;
	
	public ControlerFormEmp(TableEmployer tmp) {
		this.home = tmp ;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {

		if( ((JButton)event.getSource()).getText().equals("Ajouter"))
		{
			
			new ViewAjouterEmployer();
			home.dispose();

		}
		else if( ((JButton)event.getSource()).getText().equals("Modifier"))
		{
			int row = home.getTable().getSelectedRow();
			int id = Integer.parseInt(home.getTable().getValueAt(row,0).toString());
			String nom = home.getTable().getValueAt(row,1).toString();
			String prenom = home.getTable().getValueAt(row,2).toString();
			int salaire = Integer.parseInt(home.getTable().getValueAt(row,3).toString());
			ViewUpdateEmployer tab = new ViewUpdateEmployer();	
			tab.setText(id,nom ,prenom ,salaire);
			home.dispose();

		}
	}
	
	

		
}