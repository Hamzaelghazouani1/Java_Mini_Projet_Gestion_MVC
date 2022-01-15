package Data;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import Conn.connection;
import Models.Entreprise;

public class DataEntreprise {
	connection opn = new connection();
	java.sql.Connection con =  opn.con();
	String[][] tab = new String[100][100] ;

	public DataEntreprise() throws SQLException {	}
	
	
	
	@SuppressWarnings({ "null", "unused"})
	public String[][] getemployer() throws SQLException {
		int i = 0;
	//étape 3: créer l'objet statement 
		String query = "SELECT * FROM entreprise" ;
		PreparedStatement ps =  (PreparedStatement) con.prepareStatement(query);
		//ps.setInt(1, 1);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			tab[i][0] = rs.getString(1);
			tab[i][1] = rs.getString(2);
			tab[i][2] = rs.getString(3);
			i++;
		}
		Boolean bl = opn.closecon(con);

		return tab;
	}
	
	@SuppressWarnings("unused")
	public void postEnt(Entreprise ent) throws SQLException {
		
		String query = "INSERT INTO entreprise (ID_ENTREPRISE, NOM_ENTREPRISE, SECTION) VALUES(?,?,?)" ;
		PreparedStatement ps =  (PreparedStatement) con.prepareStatement(query);
		ps.setInt(1, ent.getId());
		ps.setString(2, ent.getNomEntreprise());
		ps.setString(3, ent.getSection());
	    ps.executeUpdate();
		Boolean bl = opn.closecon(con);
		System.out.println("qsfdsqd");
		
	}
	
	@SuppressWarnings("unused")
	public void updatePostEnt(Entreprise ent) throws SQLException {
		
		String query = "UPDATE entreprise SET NOM_ENTREPRISE = ?, SECTION = ? where ID_ENTREPRISE = ?" ;
		PreparedStatement ps =  (PreparedStatement) con.prepareStatement(query);
		ps.setString(1, ent.getNomEntreprise());
		ps.setString(2, ent.getSection());
		ps.setInt(3, ent.getId());

	    ps.executeUpdate();
		Boolean bl = opn.closecon(con);

	}


}


