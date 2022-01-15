package Views;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controler.UpdateModifieremp;
import Models.Employer;


public class ViewUpdateEmployer extends JFrame  {
	private static final long serialVersionUID = 1L;

	private Employer employer = new Employer(); 


	private JLabel lbId;
	private JLabel blNom;
	private JLabel lbPrenom;
	private JLabel lbsalaire;

	private static JTextField txtId = new JTextField();
	private static JTextField txtNom = new JTextField();
	private static JTextField txtPrenom = new JTextField();
	private static JTextField txtsalaire = new JTextField();
	
	private JButton btnAjouter= new JButton("Valider");
	private JButton btnAnnuler= new JButton("annuler");	
	
	//->l'appele du controler qui contient les action du click
	private UpdateModifieremp controle = new UpdateModifieremp(this);;

	
	
	public ViewUpdateEmployer() {
		super("Employer ");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setResizable(false);

		this.setLocationRelativeTo(null);
		JPanel content = (JPanel)this.getContentPane();
		content.setLayout(null);

			lbId = new JLabel("ID : ");
			blNom = new JLabel("Nom :");
			lbPrenom = new JLabel("Prenom : ");
			lbsalaire = new JLabel("Salaire : ");
			
			//->  positionner + Ajoute au panel
			positionlbl_emp(lbId,blNom,lbPrenom,lbsalaire,content);
			positionltxt_emp(txtId, txtNom, txtPrenom, txtsalaire,content);
			
			//-> Ajouter les btn au panel
			AjouterBtn(content);
			
			 //->action de click  |>| UpdateModifieremp
			btnAjouter.addActionListener(controle);
			btnAnnuler.addActionListener(controle);
			setVisible(true);
		

	}
	
	public Employer pers() {
		employer.setId(Integer.parseInt(txtId.getText()));
		employer.setNomEmployer(txtNom.getText());
		employer.setPrnomEmployer(txtPrenom.getText());
		employer.setSalaire(Integer.parseInt(txtsalaire.getText()));
		return employer;
	}
	
	public void setText(int id,String nom ,String Prenom ,int salaire) {
		 txtId.setText(id+"");
		 txtNom.setText(nom); 
		 txtPrenom.setText(Prenom);;
		 txtsalaire.setText(salaire+"");
	}
	
	private void positionlbl_emp(JLabel bl1,JLabel bl2,JLabel bl3,JLabel bl4 ,JPanel content) {
		bl1.setBounds(150, 40, 120, 30);
		bl2.setBounds(150, 90, 120, 30);
		bl3.setBounds(150, 140, 120, 30);
		bl4.setBounds(150, 190, 120, 30);
		
		//ajouter le contenue de panel
		content.add(lbId);
		content.add(blNom);
		content.add(lbPrenom);
		content.add(lbsalaire);
	}
	
	private void positionltxt_emp(JTextField txt1,JTextField txt2,JTextField txt3,JTextField txt4,JPanel content) {
		txt1.setBounds(250, 40, 220, 30);
		txt2.setBounds(250, 90, 220, 30);
		txt3.setBounds(250, 140, 220, 30);
		txt4.setBounds(250, 190, 220, 30);
		//ajouter le contenue de panel		
		content.add(txtId);
		content.add(txtNom);
		content.add(txtPrenom);
		content.add(txtsalaire);
	}

	private void AjouterBtn(JPanel content) {
		btnAjouter.setBounds(370, 250, 80, 30);
		btnAnnuler.setBounds(270, 250, 80, 30);
		//ajouter le contenue de panel		
		content.add(btnAjouter);
		content.add(btnAnnuler);
	}


}
