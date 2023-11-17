package com.jdbcDemo;

import java.sql.*;
public class CreateTableDemo {
	public static void main(String[] args) throws Exception {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user="GIVE UR SQL USER NAME";
		String pass= "GIVE UR SQL PASSWORD";
		String sql= "CREATE TABLE cricketers(jersey NUMBER,name VARCHAR2(20))";//SEND this state to ORACLE DBMS
        Class.forName(driver);
        Connection con=DriverManager.getConnection(url,user,pass);
        //CREATING STATMENT
       Statement st= con.createStatement();// NOW the spaceship ready to launch
       st.execute(sql);
       

	}

}
