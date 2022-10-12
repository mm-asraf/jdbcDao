package com.jdbcDao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbcDao.utility.DBUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String insertStudentDetails(int roll, String name, int marks) {
		
		String message = "not inserted yet";
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
		PreparedStatement ps = 	conn.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, roll);
		ps.setString(2, name);
		ps.setInt(3, marks);
		
		
	  int x = 	ps.executeUpdate();
	  
	  if(x > 0) {
		  message = "Record inserted successfully";
	  }
			
		} catch (SQLException e) {
			// TODO: handle exception
			message = e.getMessage();
		}
		
	
		return message;
	}

}
