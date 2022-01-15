package Views;

import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Controler.ControlerFormServ;

@SuppressWarnings("serial")
public class TableService extends JFrame{
	private JButton btnAjouter= new JButton("Ajouter");
	private JButton btnModifier= new JButton("Modifier");
	private JTable table ;
	//->l'appele du controler qui contient les action du click
	private ControlerFormServ controle = new ControlerFormServ(this);
	
	public TableService(String[][] tmp) throws SQLException{
		super("Table Inforamation Service");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		JPanel content = (JPanel)this.getContentPane();   
		content.setLayout(null);
		//les titres des columns de notre Table 
		 String[] columns = new String[] {"Id_Service","Id_Employer", "Nom_Employer", "Effectif"};
	     	//crée un JTable avec des données
		 table = new JTable(tmp, columns);
		 
		//-> pour ajouter nomtre table + scrollPane a notre fenetre
		content.add(table);
		JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(50, 20, 500, 250);
	    content.add(scrollPane);
	    
	    //->fonction pour ajouter les Btn |v|
	    AjouterBtn(content);
	    
	    //->action de click  |>| ControlerFormServ
	    btnAjouter.addActionListener(controle);	    
	    btnModifier.addActionListener(controle);
	    
		setVisible(true);

	}
	
	
	private void AjouterBtn(JPanel content) {
		btnModifier.setBounds(320, 300, 80, 30);
		btnAjouter.setBounds(220, 300, 80, 30);
		//ajouter le contenue de panel		
		content.add(btnAjouter);
		content.add(btnModifier);
	}
	
	public JTable getTable() {
		return table;
	}
	
}
