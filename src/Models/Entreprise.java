package Models;


public class Entreprise {
	private int id;
	private String nomEntreprise;
	private String section;
	
	public Entreprise() {
		
	}
	public Entreprise(int id,String nomEntreprise ,String section) {
		this.id = id;
		this.nomEntreprise = nomEntreprise;
		this.section = section;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
}
