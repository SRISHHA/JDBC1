package JDBC;
import java.sql.*;
public class jdbc {

	public static void main(String[ ] args) {
		try
		{
			String url="jdbc:mysql://localhost:3306/movies";
			String uname="root";
			String pw="Srishha@2001";
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,uname,pw);
			Statement st=con.createStatement();
			String query="create table movies(name varchar(20),actor varchar(20),actress varchar(20),director varchar(20),year int)";
			
			
		    st.execute(query);
		 
		   
		    String query1="insert into movies"+" values('enthiran','rajini','aishwarya rai','shankar','2010')";
		    st.executeUpdate(query1);
		  
		    String query2="insert into movies"+" values('raja rani','arya','nayanthara','atlee','2013')";
		    st.executeUpdate(query2);
		   
		    String query3="insert into movies"+" values('three','dhanush','shruthi hasan','aishwarya dhanush','2012')";
		    st.executeUpdate(query3);
		   
		    String query4="insert into movies"+" values('bhagubali','prabhas','tamanah','rajmouli','2015')";
		    st.executeUpdate(query4);
		   
		    String query5="insert into movies"+" values('bhagubali2','prabhas','tamanah','rajmouli','2015')";
		    st.executeUpdate(query5);
		    
		    String query6="select * from movies";
		   ResultSet rs1=st.executeQuery(query6);
		   rs1.next();
		System.out.println(rs1);
		    String query7="select name from movies where actor='dhanush'";
		    st.executeQuery(query7);
		    ResultSet rs2=st.executeQuery(query7);
		    while(rs1.next()) {
		System.out.println(rs1.getString( 1));
		System.out.println(rs1.getString( 2));
		System.out.println(rs1.getString( 3));
		System.out.println(rs1.getString( 4));
		System.out.println(rs1.getString( 5));
		   }
		    
		    	String movname=rs2.getString("name");
		    System.out.println(movname);
		    
		  
		    st.close();
		    con.close();
		    
		    

	
		    
		    
		    

		    		
		
		    
			
		}
catch(Exception e)
		{
	System.out.println(e);
		}
	}

}
