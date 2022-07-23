package com.dao;
import java.sql.*;

import com.model.Model1;

public class Dao1 {
	
	public int getObject (int id, String name, int experience, int age) {
		
		//Model1 md = new Model1();
		int n = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "kundapura@007");
			//PreparedStatement st = con.prepareStatement("SELECT * FROM employee WHERE id = ? ");
			//st.setInt(1, id);
			
			/*Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM employee WHERE id=" + id);
			if (rs.next()) {
				md.setId(rs.getInt("id"));
				md.setName(rs.getString("name"));
				md.setExperience(rs.getInt("experience"));
				md.setAge(rs.getInt("age"));
			}*/
			
			//PreparedStatement pt = con.prepareStatement("INSERT INTO employee VALUES" + "(7, 'bumrah', 3, 27)");
			/*PreparedStatement pt = con.prepareStatement("INSERT INTO employee VALUES(?, ?, ?, ?)");
			pt.setInt(1, id);
			pt.setString(2, name);
			pt.setInt(3, experience);
			pt.setInt(4, age);
			n = pt.executeUpdate();*/
			
			int a = 9;
			Statement st = con.createStatement();
			n = st.executeUpdate("DELETE FROM employee WHERE id = " + a);
			
			/*Statement st = con.createStatement();
			n = st.executeUpdate("INSERT INTO employee VALUES(9, 'bumrah', 3, 27)");*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*md.setAge(12);
		md.setExperience(21);
		md.setId(id);
		md.setName("rahul");*/
		
		//return md;
		return n;
		
	}

}
