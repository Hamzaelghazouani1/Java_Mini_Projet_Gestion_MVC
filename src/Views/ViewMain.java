package Views;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import Controler.ControlerTables;

@SuppressWarnings("serial")
public class ViewMain extends JFrame{

	//declaration des commposennt de norte fenétre :
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu = new JMenu("Choix");
	
	//->declaration des composent du menu
	private JMenuItem emp = new JMenuItem("Employer");
	private JMenuItem ser = new JMenuItem("Service");
	private JMenuItem entr = new JMenuItem("Entreprise");
	
	//->l'appele du controler qui contient les action du click
	private ControlerTables action =  new ControlerTables(this);

	public ViewMain(){
		super("Table Inforamation");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		JPanel content = (JPanel)this.getContentPane();   
		content.add(menuBar,BorderLayout.NORTH);		
		menuBar.add(menu); 
		menu.add(emp);
		menu.add(ser);
		menu.add(entr);
		 //->action de click  |>| ControlerTables
		emp.addActionListener(action);
		ser.addActionListener(action);
		entr.addActionListener(action);
		setVisible(true);
		
	}


	public JMenuItem getEntreprise() {
		return entr;
	}

	public JMenuItem getService() {
		return ser;
	}


	public JMenuItem getEmployer() {
		return emp;
	}



	
}
