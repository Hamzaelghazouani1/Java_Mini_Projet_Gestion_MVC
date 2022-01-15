package Data;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import Conn.connection;
import Models.Employer;

public class DataEmployer {
	connection opn = new connection();
	java.sql.Connection con =  opn.con();
	String[][] tab = new String[100][100] ;

	public DataEmployer() throws SQLException {
		//postEmp(10,"test1","tect",100);
	}
	
	
	@SuppressWarnings("unused")
	public String[][] getemployer() throws SQLException {
		int i = 0;
		//étape 3: créer l'objet statement 
		String query = "SELECT * FROM employer" ;
		PreparedStatement ps =  (PreparedStatement) con.prepareStatement(query);
		//pour executer notre requet SQL
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
	public void postEmp(Employer emp) throws SQLException {
		
		String query = "INSERT INTO employer (ID_EMPLOYER, NOM_EMLPOYER, PRENOM_EMPLOYER, SALAIRE) VALUES(?,?,?,?)" ;
		PreparedStatement ps =  (PreparedStatement) con.prepareStatement(query);
		ps.setInt(1, emp.getId());
		ps.setString(2,emp.getNomEmployer() );
		ps.setString(3, emp.getPrnomEmployer());
		ps.setInt(4, emp.getSalaire());
	    ps.executeUpdate();
		Boolean bl = opn.closecon(con);

	}
	
	@SuppressWarnings("unused")
	public void updatePostEmp(Employer emp) throws SQLException {
		
		String query = "UPDATE employer SET NOM_EMLPOYER = ? , PRENOM_EMPLOYER = ?, SALAIRE = ? where ID_EMPLOYER = ?" ;
		PreparedStatement ps =  (PreparedStatement) con.prepareStatement(query);
		ps.setString(1,emp.getNomEmployer() );
		ps.setString(2, emp.getPrnomEmployer());
		ps.setInt(3, emp.getSalaire());
		ps.setInt(4, emp.getId());

	    ps.executeUpdate();
		Boolean bl = opn.closecon(con);

	}


}


