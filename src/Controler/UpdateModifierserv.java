package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import Data.DataService;
import Views.ViewUpdateService;

public class UpdateModifierserv implements ActionListener {
	private ViewUpdateService home;
	
	public UpdateModifierserv(ViewUpdateService tmp) {
		this.home = tmp ;
		
	}

	public void actionPerformed(ActionEvent event) {

		if( ((JButton)event.getSource()).getText().equals("Valider"))
		{
			try {
				DataService ent = new DataService();
				ent.updatePostserv(home.serv());
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