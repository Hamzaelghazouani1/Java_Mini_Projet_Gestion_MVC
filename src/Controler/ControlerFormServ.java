package Controler;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import Views.ViewAjouterService;
import Views.ViewUpdateService;
import Views.TableService;




public class ControlerFormServ implements ActionListener {
	private TableService home;
	public ControlerFormServ(TableService tmp) {
		this.home = tmp ;
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if( ((JButton)event.getSource()).getText().equals("Ajouter"))
		{
			
			new ViewAjouterService();
			home.dispose();
		}
		else if( ((JButton)event.getSource()).getText().equals("Modifier"))
		{
			int row = home.getTable().getSelectedRow();
			int id = Integer.parseInt(home.getTable().getValueAt(row,0).toString());
			int id_emp = Integer.parseInt(home.getTable().getValueAt(row,1).toString());
			String nom = home.getTable().getValueAt(row,2).toString();
			int effectif = Integer.parseInt(home.getTable().getValueAt(row,3).toString());
			ViewUpdateService tab = new ViewUpdateService();		
			tab.setText(id,id_emp ,nom ,effectif);
			home.dispose();

		}
	}

		
}