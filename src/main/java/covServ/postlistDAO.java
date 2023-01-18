package covServ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class postlistDAO {
	private static final String RDB_DRIVE="org.postgresql.Driver";
	private static final String URL="jdbc:postgresql://localhost:5432/covpost";
	private static final String USER="devuser01";
	private static final String PW="Cov_9999";
	 
	
	public List<PostBean> findAll(){
		List<PostBean> postList = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName(RDB_DRIVE);
	 		con = DriverManager.getConnection(URL, USER, PW);
	 		pstmt = con.prepareStatement
	 				("SELECT age, gender, prefId, vaccineCount, infectionRoute, recuperationForm, recuperationDays, situation, contactperson, symptoms, service, tocure, other FROM postlist ORDER BY ID DESC;");
	 		ResultSet rs = pstmt.executeQuery();
	 		
	 		while(rs.next()) {
	 			int id = rs.getInt("id");
	 			String age = rs.getString("age");
	 			String gender = rs.getString("gender");
	 			String prefId = rs.getString("prefId");
	 			String vaccineCount = rs.getString("vaccineCount");
	 			String infectionRoute = rs.getString("infectionRoute");
	 			String recuperationForm = rs.getString("recuperationForm");
	 			String recuperationDays = rs.getString("recuperationDays");
	 			String situation = rs.getString("situation");
	 			String contactperson = rs.getString("contactperson");
	 			String symptoms = rs.getString("symptoms");
	 			String service = rs.getString("service");
	 			String tocure = rs.getString("tocure");
	 			String other = rs.getString("other");
	 			
	 			PostBean p = new PostBean(id, age, gender, prefId, vaccineCount, infectionRoute, recuperationForm, recuperationDays, situation, contactperson, symptoms, service, tocure, other);
	 			postList.add(p);
	 		}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e) {
			return null;
		}
		return postList;
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
