package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;

import Data.DataEntreprise;
import Views.ViewAjouterEntreprise;



public class AddModifierEnt implements ActionListener {
	private ViewAjouterEntreprise home;
	
	public AddModifierEnt(ViewAjouterEntreprise tmp) {
		this.home = tmp ;
		
	}

	public void actionPerformed(ActionEvent event) {

		if( ((JButton)event.getSource()).getText().equals("Valider"))
		{
			try {
				DataEntreprise emp = new DataEntreprise();
				emp.postEnt(home.entr());
				home.dispose();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if( ((JButton)event.getSource()).getText().equals("annuler"))
		{
			home.dispose();
		}
	}

		
}