package Views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controler.AddModifierEnt;
import Models.Entreprise;


public class ViewAjouterEntreprise extends JFrame  {
	private static final long serialVersionUID = 1L;

	Entreprise entreprise = new Entreprise();


	private JLabel lbId;
	private JLabel blNom;
	private JLabel lbSecteur;

	private static JTextField txtId = new JTextField();
	private static JTextField txtNom = new JTextField();
	private static JTextField txtlbSecteur = new JTextField();
	
	private JButton btnAjouter= new JButton("Valider");
	private JButton btnAnnuler= new JButton("annuler");	
	
	//->l'appele du controler qui contient les action du click
	private AddModifierEnt controle = new AddModifierEnt(this);;

	
	
	public ViewAjouterEntreprise() {
		super("my first projet Swing");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setResizable(false);

		this.setLocationRelativeTo(null);
		JPanel content = (JPanel)this.getContentPane();
		content.setLayout(null);

			lbId = new JLabel("ID : ");
			blNom = new JLabel("Nom :");
			lbSecteur = new JLabel("Secteur : ");
			
			//->  positionner + Ajoute au panel
			positionlbl_entr(lbId,blNom,lbSecteur,content);
			positionltxt_entr(txtId, txtNom, txtlbSecteur,content);
			
			//-> Ajouter les btn au panel
			AjouterBtn(content);
			
			 //->action de click  |>| AddModifierEnt
			btnAjouter.addActionListener(controle);
			btnAnnuler.addActionListener(controle);
			
			setVisible(true);
		

	}
	

	
	public Entreprise entr() {
		entreprise.setId(Integer.parseInt(txtId.getText()));
		entreprise.setNomEntreprise(txtNom.getText());
		entreprise.setSection(txtlbSecteur.getText());
		return entreprise;
	}

	

	private void positionlbl_entr(JLabel bl1,JLabel bl2,JLabel bl3,JPanel content) {
		bl1.setBounds(150, 40, 120, 30);
		bl2.setBounds(150, 90, 120, 30);
		bl3.setBounds(150, 140, 120, 30);
		
		//ajouter le contenue de panel
		content.add(lbId);
		content.add(blNom);
		content.add(lbSecteur);
	}
	private void positionltxt_entr(JTextField txt1,JTextField txt2,JTextField txt3,JPanel content) {
		txt1.setBounds(250, 40, 220, 30);
		txt2.setBounds(250, 90, 220, 30);
		txt3.setBounds(250, 140, 220, 30);
		//ajouter le contenue de panel		
		content.add(txtId);
		content.add(txtNom);
		content.add(txtlbSecteur);
	}
	
	private void AjouterBtn(JPanel content) {
		btnAjouter.setBounds(370, 250, 80, 30);
		btnAnnuler.setBounds(270, 250, 80, 30);
		//ajouter le contenue de panel		
		content.add(btnAjouter);
		content.add(btnAnnuler);
	}

}
