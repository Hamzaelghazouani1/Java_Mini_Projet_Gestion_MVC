package Conn;

import java.sql.Connection;
import java.sql.DriverManager;


public class connection {
	public Connection con() {
		try
		{
			//étape 1: charger la classe de driver
			Class.forName("com.mysql.jdbc.Driver");

			//étape 2: créer l'objet de connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion", "root", "");
			System.out.println("valider");

			return conn;
		}
		catch(Exception e){ 
			System.out.println("Exeptipn : "+e);
			return null;
		}
	}
	
	public Boolean closecon(Connection conn) {
		try
		{
			System.out.println("close");
			conn.close();
			return true;
		}
		catch(Exception e){ 
			System.out.println("Exeptipn : "+e);
			return null;
		}
	}

}
