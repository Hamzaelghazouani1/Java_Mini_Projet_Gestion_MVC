package Views;

import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Controler.ControlerFormEmp;

@SuppressWarnings("serial")
public class TableEmployer extends JFrame{
	private JButton btnAjouter= new JButton("Ajouter");
	private JButton btnModifier= new JButton("Modifier");
	
	//->l'appele du controler qui contient les action du click
	private ControlerFormEmp controle = new ControlerFormEmp(this);
	private JTable table;

	public TableEmployer(String[][] tmp) throws SQLException{
		super("Table Inforamation Employer");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setResizable(false);

		this.setLocationRelativeTo(null);
		JPanel content = (JPanel)this.getContentPane();   
		content.setLayout(null);
		
		//les titres des columns de notre Table 
		 String[] columns = new String[] {"Id", "Nom", "Prenom", "Salaire"};
		 table = new JTable(tmp, columns);
		
		//-> pour ajouter nomtre table + scrollPane a notre fenetre
		content.add(table);
		JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(50, 20, 500, 250);
	    content.add(scrollPane);
	    
	    //->fonction pour ajouter les Btn |v|
	    AjouterBtn(content);
	    
	    //->action de click  |>| ControlerFormEmp
	    btnAjouter.addActionListener(controle);	    
	    btnModifier.addActionListener(controle);	    
		setVisible(true);


	}
	
	
	
	public JTable getTable() {
		return table;
	}



	public void setTable(JTable table) {
		this.table = table;
	}



	private void AjouterBtn(JPanel content) {
		btnModifier.setBounds(320, 300, 80, 30);
		btnAjouter.setBounds(220, 300, 80, 30);
		//ajouter le contenue de panel		
		content.add(btnAjouter);
		content.add(btnModifier);
	}
	

}
