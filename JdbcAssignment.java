package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcAssignment {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("org.apache.derby.client.ClientAutoloadedDriver"); //loading drivers
		Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/training;create=false","derby","derby"); //create connection
		char ch;
		
		
		do {
			System.out.println("Enter a action: ");
			System.out.println("1. View Employee Data");
			System.out.println("2. Update Employee Data");
			System.out.println("3. Add Employee");
			System.out.println("4. Delete Employee Data");
			System.out.println("5. Exit");
			int ac = sc.nextInt();
			switch(ac) {
			case 1:
				PreparedStatement st1 = conn.prepareStatement("select * from app.employee where emp_id=?");
		        System.out.println("Enter employee id: ");
		        int id = sc.nextInt();
		        st1.setInt(1, id);
		        ResultSet rs = st1.executeQuery();
		        while(rs.next()) {
		        	System.out.println("ID: " + rs.getString(1));
		        	System.out.println("Name: " + rs.getString(2));
		        	System.out.println("Salary: " + rs.getString(3));
		        }
		        break;
		        
			case 2:
				System.out.println("Enter employee id for updating data:");
				int up = sc.nextInt();
				System.out.println("Enter Name:");
				String nm = sc.next();
				System.out.println("Enter Salary:");
				int sal = sc.nextInt();
				PreparedStatement st2 = conn.prepareStatement("UPDATE employee SET emp_nm=?, emp_sal=? WHERE emp_id=?");
				st2.setString(1,  nm);
				st2.setInt(2, sal);
				st2.setInt(3, up);
				st2.executeUpdate();
				System.out.println("Updated data!");
				break;
			case 3:
				PreparedStatement st3 = conn.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
				System.out.println("Enter employee new data");
				System.out.println("Enter employee ID= ");
				int newid = sc.nextInt();
				System.out.println("Enter employee Name= ");
				String newnm = sc.next();
				System.out.println("Enter employee Salary= ");
				int newsal = sc.nextInt();
				
				st3.setInt(1, newid);
				st3.setString(2, newnm);
				st3.setInt(3, newsal);
				st3.executeUpdate();
				System.out.println("Data Added!");
				break;
			case 4:
				PreparedStatement st4 = conn.prepareStatement("DELETE FROM employee WHERE emp_id=?");
				System.out.println("Enter employee id: ");
				int delid = sc.nextInt();
				st4.setInt(1, delid);
				ResultSet rs4=st4.executeQuery();
				int resid=rs4.getInt("emp_id");
				if(resid==delid)
				{
					System.out.println("Data Deleted!");
				}
				else
				{
					System.out.println("Data already not available!");
				}
				break;
			case 5:
				System.out.println("bye");
				System.exit(0);
			default:
				System.out.println("Invalid Entry...");
				break;
			}
			System.out.println("Do you want to continue (Y/N)");
			ch = sc.next().charAt(0);
		}
		while(ch == 'Y' || ch == 'y');
	}
}


/*
 *Question :
 * Create a menu for 4 actions: 
 * 1. View Employee Data 
 * 2. Update Employee Data 
 * 3. Add Employee 
 * 4. Delete Employee Data 
 * 5. Exit
 */