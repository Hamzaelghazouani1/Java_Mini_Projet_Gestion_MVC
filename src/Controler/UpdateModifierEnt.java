package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import Data.DataEntreprise;
import Views.ViewUpdateEntremprise;

public class UpdateModifierEnt implements ActionListener {
	private ViewUpdateEntremprise home;
	
	public UpdateModifierEnt(ViewUpdateEntremprise tmp) {
		this.home = tmp ;
		
	}

	public void actionPerformed(ActionEvent event) {
		if( ((JButton)event.getSource()).getText().equals("Valider"))
		{
			try {
				DataEntreprise ent = new DataEntreprise();
				ent.updatePostEnt(home.entr());
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