package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import Data.DataEmployer;
import Data.DataEntreprise;
import Data.DataService;
import Views.TableEmployer;
import Views.TableEntreprise;
import Views.TableService;
import Views.ViewMain;

public class ControlerTables implements ActionListener {
	private ViewMain home;
	//notre constructeur
	public ControlerTables(ViewMain tmp) {
		this.home = tmp ;
	}

	//notre action
	public void actionPerformed(ActionEvent event) {
		if( event.getSource() == home.getEmployer()){
			afficherTableEmployer();
		}
		else if( event.getSource() == home.getService()){
			 afficherTableService() ;
		}
		else if( event.getSource() == home.getEntreprise()){
			afficherTableEmplacement();
		}
	}
	
	//notre fonction du controle
	private void afficherTableEmployer() {
		try {
			//creation d'in constructeur de Type Model
			//->pour faire la connection avec le Model
			DataEmployer emp = new DataEmployer();
			//->L'appele du Table + replissage avec les données du employer
			new TableEmployer(emp.getemployer());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void afficherTableService() {

		try {
			DataService serv = new DataService();
			new TableService(serv.getemployer());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void afficherTableEmplacement() {
		try {
			DataEntreprise ent = new DataEntreprise();
			new TableEntreprise(ent.getemployer());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

