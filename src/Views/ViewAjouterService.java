package Views;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controler.AddModifierServ;


public class ViewAjouterService extends JFrame  {
	private static final long serialVersionUID = 1L;
	
	private Models.Service service = new Models.Service();
	
	private JLabel blId_service;
	private JLabel blId_employer;
	private JLabel lbnom;
	private JLabel lbeffictif;

	private static JTextField txtId_service= new JTextField();
	private static JTextField txtId_employer = new JTextField();
	private static JTextField txtnom = new JTextField();
	private static JTextField txteffictif = new JTextField();
	
	private JButton btnAjouter= new JButton("Valider");
	private JButton btnAnnuler= new JButton("annuler");	
	
	//->l'appele du controler qui contient les action du click
	private AddModifierServ controle = new AddModifierServ(this);;

	
	
	public ViewAjouterService() {
		super("my first projet Swing");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		JPanel content = (JPanel)this.getContentPane();
		content.setLayout(null);

			blId_service = new JLabel("ID Service : ");
			blId_employer = new JLabel("ID Employer : ");
			lbnom = new JLabel("Nom :");
			lbeffictif = new JLabel("Effectif : ");
			
			//->  positionner + Ajoute au panel
			positionlbl_Service(blId_service,blId_employer, lbnom, lbeffictif, content);
			positionltxt_Service( txtId_service,txtId_employer, txtnom, txteffictif, content);
			
			//-> Ajouter les btn au panel
			AjouterBtn(content);
			
			 //->action de click  |>| AddModifierServ
			btnAjouter.addActionListener(controle);
			btnAnnuler.addActionListener(controle);
			setVisible(true);
		

	}

	public Models.Service serv() {
		service.setId(Integer.parseInt(txtId_service.getText()));
		service.setIdEmp(Integer.parseInt(txtId_employer.getText()));
		service.setNomService(txtnom.getText());
		service.setEffictif(Integer.parseInt(txteffictif.getText()));
		return service;
	}
	
	private void positionlbl_Service(JLabel bl1,JLabel bl2,JLabel bl3,JLabel bl4 ,JPanel content) {
		bl1.setBounds(150, 40, 120, 30);
		bl2.setBounds(150, 90, 120, 30);
		bl3.setBounds(150, 140, 120, 30);
		bl4.setBounds(150, 190, 120, 30);
		
		//ajouter le contenue de panel
		content.add(blId_service);
		content.add(blId_employer);
		content.add(lbnom);
		content.add(lbeffictif);
	}
	private void positionltxt_Service(JTextField txt1,JTextField txt2,JTextField txt3,JTextField txt4,JPanel content) {
		txt1.setBounds(250, 40, 220, 30);
		txt2.setBounds(250, 90, 220, 30);
		txt3.setBounds(250, 140, 220, 30);
		txt4.setBounds(250, 190, 220, 30);
		//ajouter le contenue de panel	
		content.add(txtId_service);
		content.add(txtId_employer);
		content.add(txtnom);
		content.add(txteffictif);
	}

	
	private void AjouterBtn(JPanel content) {
		btnAjouter.setBounds(370, 250, 80, 30);
		btnAnnuler.setBounds(270, 250, 80, 30);
		//ajouter le contenue de panel		
		content.add(btnAjouter);
		content.add(btnAnnuler);
	}
	


}
