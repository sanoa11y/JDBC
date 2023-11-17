package com.jdbcDemo;
import java.sql.*;
import java.util.*;

public class DynamicDataDemo {
	public static void main(String[] args) throws Exception  {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user="GIVE UR SQL USER NAME";
		String pass= "GIVE UR SQL PASSWORD";
		String sql= "INSERT INTO  cricketers VALUES(?,?)";//enter more data in new rows
		//user i/p
		Scanner scan=new Scanner(System.in);
		System.out.println("PLEASE ENTER JERSEY");
		int j=scan.nextInt();
		System.out.println("PLEASE ENTER NAME");
		scan.nextLine();
		String name=scan.nextLine();
		 Class.forName(driver);
	        Connection con=DriverManager.getConnection(url,user,pass);
	        //CREATING STATMENT
	       PreparedStatement ps= con.prepareStatement(sql);//WHENEVER USE DYNAMIC DATA USE PREPARED STATEMENT
           ps.setInt(1,j);
           ps.setString(2, name);
          ps.executeUpdate();
         
}
}