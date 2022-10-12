package com.jdbcDao.useCases;

import java.util.Scanner;

import com.jdbcDao.dao.StudentDao;
import com.jdbcDao.dao.StudentDaoImpl;

public class InsertStudentUseCase {
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter Roll ");
		int roll = inp.nextInt();
		
		System.out.println("Enter name");
		String name = inp.next();
		
		System.out.println("Enter marks ");
		int marks = inp.nextInt();
		
		
//		StudentDaoImpl dao = new 	StudentDaoImpl(); // tightly coupled program structure
		StudentDao dao = new StudentDaoImpl();  // loosely coupled program structure
		String result = dao.insertStudentDetails(roll, name, marks);
		
		System.out.println(result);
		
		
		
	}
}
