package com.jdbcDemo;

import java.sql.*;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user="GIVE UR SQL USER NAME";
		String pass= "GIVE UR SQL PASSWORD";
		String sql= "INSERT INTO cricketers VALUES(8,'SUN')";//we can create multiple row using single code after run it stored in oracle next row can insert
		String sql1= "INSERT INTO cricketers VALUES(9,'STAR')";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(url,user,pass);
        //CREATING STATMENT
       Statement st= con.createStatement();
      // NOW the spaceship ready to launch
       st.execute(sql1);
       System.out.println("Connection successfull");

	}

}
