package Models;

public class Service {
	private int id;
	private int idEmp;
	private String nomService;
	private int effictif;
	
	public Service() {
	}
	public Service(int id , int idEmp,String nomService ,int effictif) {
		this.id = id;
		this.nomService = nomService;
		this.effictif = effictif;
		this.idEmp = idEmp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEmp() {
		return idEmp;
	}
	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}
	public String getNomService() {
		return nomService;
	}
	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
	public int getEffictif() {
		return effictif;
	}
	public void setEffictif(int effictif) {
		this.effictif = effictif;
	}
}
