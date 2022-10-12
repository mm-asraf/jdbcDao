package com.jdbcDao.useCases;

import java.sql.Connection;

import com.jdbcDao.utility.DBUtil;

public class ConnTest {
	
	public static void main(String[] args) {
		Connection conn = DBUtil.provideConnection();
		System.out.println(conn);
	}
}
