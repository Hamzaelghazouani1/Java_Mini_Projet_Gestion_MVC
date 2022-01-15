package Controler;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Views.ViewUpdateEntremprise;
import Views.ViewAjouterEntreprise;
import Views.TableEntreprise;




public class ControlerFormEntr implements ActionListener {
	private TableEntreprise home;
	public ControlerFormEntr(TableEntreprise tmp) {
		this.home = tmp ;
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		if( ((JButton)event.getSource()).getText().equals("Ajouter"))
		{
			new ViewAjouterEntreprise();
			home.dispose();
		}
		else if( ((JButton)event.getSource()).getText().equals("Modifier"))
		{
			int row = home.getTable().getSelectedRow();
			int id = Integer.parseInt(home.getTable().getValueAt(row,0).toString());
			String nom = home.getTable().getValueAt(row,1).toString();
			String section = home.getTable().getValueAt(row,2).toString();
			ViewUpdateEntremprise tab = new ViewUpdateEntremprise();
			tab.setText(id,nom ,section );
			home.dispose();

		}
	}

		
}