package com.jdbcDemo;

import java.sql.*;

public class UpdateDemo {
	public static void main(String[] args) throws Exception {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user="GIVE UR SQL USER NAME";
		String pass= "GIVE UR SQL PASSWORD";
		String sql= "UPDATE cricketers SET name='MAHI' WHERE jersey=7";//we can create multiple row using single code after run it stored in oracle next row can insert
		String sql1= "UPDATE cricketers SET jersey= 6 WHERE name='STAR'";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(url,user,pass);
        //CREATING STATMENT
       Statement st= con.createStatement();// NOW the spaceship ready to launch
       st.executeUpdate(sql1);
	

	}

}
