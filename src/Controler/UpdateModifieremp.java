package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import Data.DataEmployer;
import Views.ViewUpdateEmployer;

public class UpdateModifieremp implements ActionListener {
	private ViewUpdateEmployer home;
	
	public UpdateModifieremp(ViewUpdateEmployer tmp) {
		this.home = tmp ;
		
	}

	public void actionPerformed(ActionEvent event) {
		if( ((JButton)event.getSource()).getText().equals("Valider"))
		{
			try {
				DataEmployer emp = new DataEmployer();
				emp.updatePostEmp(home.pers());
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