package Data;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import Conn.connection;
import Models.Service;

public class DataService {
	connection opn = new connection();
	java.sql.Connection con =  opn.con();
	String[][] tab = new String[100][100] ;

	public DataService() throws SQLException {
		//getemployer();
	}
	
	
	
	
	
	
	@SuppressWarnings({ "null", "unused" })
	public String[][] getemployer() throws SQLException {
		int i = 0;
	//étape 3: créer l'objet statement 
		String query = "SELECT * FROM service" ;
		PreparedStatement ps =  (PreparedStatement) con.prepareStatement(query);
		//ps.setInt(1, 1);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			tab[i][0] = rs.getString(1);
			tab[i][1] = rs.getString(2);
			tab[i][2] = rs.getString(3);
			tab[i][3] = rs.getString(4);
			i++;
		}
		Boolean bl = opn.closecon(con);

		return tab;
	}

	@SuppressWarnings("unused")
	public void postServ(Service serv) throws SQLException {
		
		String query = "INSERT INTO service (ID_SERVICE,ID_EMPLOYER, NOM_SERVICE, EFFICTIF) VALUES(?,?,?,?)" ;
		PreparedStatement ps =  (PreparedStatement) con.prepareStatement(query);
		ps.setInt(1, serv.getId());
		ps.setInt(2, serv.getIdEmp());
		ps.setString(3, serv.getNomService());
		ps.setInt(4, serv.getEffictif());
	    ps.executeUpdate();
		Boolean bl = opn.closecon(con);
		System.out.println("qsfdsqd");
		
	}

	@SuppressWarnings("unused")
	public void updatePostserv(Service serv) throws SQLException {
		
		String query = "UPDATE service SET ID_EMPLOYER = ? , NOM_SERVICE = ?,EFFICTIF = ? where ID_SERVICE = ?" ;
		PreparedStatement ps =  (PreparedStatement) con.prepareStatement(query);
		ps.setInt(1, serv.getIdEmp());
		ps.setString(2, serv.getNomService());
		ps.setInt(3, serv.getEffictif());
		ps.setInt(4, serv.getId());

	    ps.executeUpdate();
		Boolean bl = opn.closecon(con);

	}


}


