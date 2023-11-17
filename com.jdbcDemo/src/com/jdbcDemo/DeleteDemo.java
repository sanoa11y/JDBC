package com.jdbcDemo;

import java.sql.*;

public class DeleteDemo {
	public static void main(String[] args) throws Exception  {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user="GIVE UR SQL USER NAME";
		String pass= "GIVE UR SQL PASSWORD";
		String sql= "DELETE FROM cricketers WHERE jersey=7";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(url,user,pass);
        //CREATING STATMENT
       Statement st= con.createStatement();// NOW the spaceship ready to launch
       st.executeUpdate(sql);
	

		

	}

}
