package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;

import Data.DataService;
import Views.ViewAjouterService;




public class AddModifierServ implements ActionListener {
	private ViewAjouterService home;
	
	public AddModifierServ(ViewAjouterService tmp) {
		this.home = tmp ;
		
	}

	public void actionPerformed(ActionEvent event) {
		if( ((JButton)event.getSource()).getText().equals("Valider")){
			try {
				DataService emp = new DataService();
				emp.postServ(home.serv());
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