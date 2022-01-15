package Models;

public class Employer {
	private int id;
	private String nomEmployer;
	private String prenomEmployer;
	private int salaire;
	
	public Employer() {
		
	}
	public Employer(int id,String nomEmployer ,String prenomEmployer,int salaire) {
		this.id = id;
		this.nomEmployer = nomEmployer;
		this.prenomEmployer = prenomEmployer;
		this.salaire = salaire;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomEmployer() {
		return nomEmployer;
	}
	public void setNomEmployer(String nomEmployer) {
		this.nomEmployer = nomEmployer;
	}
	public String getPrnomEmployer() {
		return prenomEmployer;
	}
	public void setPrnomEmployer(String prnomEmployer) {
		this.prenomEmployer = prnomEmployer;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

}
