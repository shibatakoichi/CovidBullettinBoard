package covServ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class postlistDAO {
	private static final String RDB_DRIVE="org.postgresql.Driver";
	private static final String URL="jdbc:postgresql://localhost:5432/covpost";
	private static final String USER="devuser01";
	private static final String PW="Cov_9999";
	 
	
	private static Connection getConnection() {	
	 	try{
	 		Class.forName(RDB_DRIVE);
	 		con = DriverManager.getConnection(URL, USER, PW);
	 	}catch (SQLException e) {
	 		return null;
	 	}catch (ClassNotFoundException e) {
	 		return null;
	 	}
	}
	
	public List<Post> find(){
		Connection con = null;
		PreparedStatement pstmt = null;
		
		List<Post> mutterList = new ArrayList<>();
		
		
	}
	public static Connection create(PostBean p){
		Connection con = null;
		PreparedStatement pstmt = null;
	 	try{
	 		Class.forName(RDB_DRIVE);
	 		con = DriverManager.getConnection(URL, USER, PW);
	 		pstmt = con.prepareStatement
	 				("INSERT INTO postlist(age, gender, prefId, vaccineCount, infectionRoute,recuperationForm, recuperationDays, situation, contactperson, symptoms, service, tocure, other) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
	 		pstmt.setString(1, p.getAge());
	 		pstmt.setString(2, p.getGender());
	 		pstmt.setString(3, p.getPrefId());
	 		pstmt.setString(4, p.getVaccineCount());
	 		pstmt.setString(5, p.getInfectionRoute());
	 		pstmt.setString(6, p.getRecuperationForm());
	 		pstmt.setString(7, p.getRecuperationDays());
	 		pstmt.setString(8, p.getSituation());
	 		pstmt.setString(9, p.getContactperson());
	 		pstmt.setString(10, p.getSymptoms());
	 		pstmt.setString(11, p.getService());
	 		pstmt.setString(12, p.getTocure());
	 		pstmt.setString(13, p.getOther());

	 		pstmt.executeUpdate();
	 		
	 	}catch (SQLException e) {
	 		return null;
	 	}catch (ClassNotFoundException e) {
	 		return null;
	 	}finally{

	 			if (pstmt != null) {
	 				try {
	 					pstmt.close();
	 				}catch(SQLException e) {
	 				}
	 			}
	 			if (con != null) {
	 				try {
	 					con.close();
	 			}catch(SQLException e) {
	 			}
	 		}
	 	}
		return con;
	}
}
