package crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			
		}
		catch(ClassNotFoundException e){
			System.out.println("Class not found");
		}
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Capgemini123");
			stmt = conn.createStatement();
			
			//DROP TABLE
//			String dropTable = "drop table student";
//			stmt.executeUpdate(dropTable);
//			System.out.println("Table Dropped");
			
			//CREATE TABLE
//			String sql = "create table student(rollno number(3), name varchar2(10), course varchar2(10))";
//			stmt.executeUpdate(sql);
//			System.out.println("Table is Created");
			
			//INSERT DATA
//			String insert = "insert into student values(101, 'chirag', 'B.Tech')";
//			stmt.executeUpdate(insert);
//			insert = "insert into student values(102, 'suraj', 'B.Tech')";
//			stmt.executeUpdate(insert);
//			insert = "insert into student values(103, 'sushil', 'B.Tech')";
//			stmt.executeUpdate(insert);
//			insert = "insert into student values(104, 'sagar', 'BCA')";
//			stmt.executeUpdate(insert);
//			insert = "insert into student values(105, 'simran', 'B.Com')";
//			stmt.executeUpdate(insert);
//			insert = "insert into student values(106, 'saurabh', 'B.Com')";
//			stmt.executeUpdate(insert);
//			insert = "insert into student values(107, 'sarmishta', 'BCA')";
//			stmt.executeUpdate(insert);
//			System.out.println("Values are inserted");
			
			//RETRIEVING DATA
//			ResultSet rs = stmt.executeQuery("select * from student");
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3));
//			}
//			System.out.println("Values Retrieved");
			
			//DELETING DATA
//			String delete = ("delete from student where name ='simran'");
//			stmt.executeQuery(delete);
//			System.out.println("Row is deleted");
//			ResultSet rs = stmt.executeQuery("select * from student");
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" " +rs.getString(3));
//			}
			//UPDATE DATA
//			String update = "update student set course='B.Tech' where rollno = 102";
//			stmt.executeUpdate(update);
//			String retrieve = ("select * from student");
//			ResultSet rs = stmt.executeQuery(retrieve);
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+" "+ rs.getString(2) + " "+rs.getString(3));
//			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
