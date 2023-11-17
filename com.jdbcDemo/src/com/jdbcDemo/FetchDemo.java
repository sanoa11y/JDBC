package com.jdbcDemo;

import java.sql.*;
public class FetchDemo {

	public static void main(String[] args) throws Exception  {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user="GIVE UR SQL USER NAME";
		String pass= "GIVE UR SQL PASSWORD";
		String sql= "SELECT * FROM cricketers ";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(url,user,pass);
        //CREATING STATMENT
       Statement st= con.createStatement();// NOW the spaceship ready to launch
      ResultSet rs= st.executeQuery(sql);
      while(rs.next()) {
    	  System.out.println(rs.getInt(1)+ " : "+rs.getString(2));
      }

	}

}
