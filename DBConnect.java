
package dbconnect;

import java.sql.*;

public class DBConnect
 {
    public DBConnect()
    {
    try 
    {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    String path="D:\\segi college\\sem 5\\Object Oriented\\DBConnect\\VideoCompany.mdb";
    String url="jdbc:ucanaccess://"+path;
    
    Connection conn=DriverManager.getConnection(url);
    System.out.println("Connected to Database");
    
    //sql2
    /*
    String sqlInsert ="INSERT INTO Video(vid,vname,vprice)VALUES('7','Avatar','99')";
     Statement st=conn.createStatement();
     st.executeUpdate(sqlInsert);
     System.out.println("Insertion into database successful");
    */
    /*
     String sqlDelete ="DELETE FROM Video WHERE vid='7'";
       Statement st=conn.createStatement();
     st.executeUpdate(sqlDelete);
     System.out.println("Delete into database successful");
    */
    
    String sqlUpdate="UPDATE Video SET vname='Toy Story' WHERE vid='6'";
       Statement st=conn.createStatement();
     st.executeUpdate(sqlUpdate);
     System.out.println("Updated into database successful");
    //sql
    String sql="SELECT vname,vprice FROM video";
    
    //get the record from the table;
    
   
    ResultSet result=st.executeQuery(sql);
    
    while (result.next())
    {
    System.out.print(result.getString(1)+" ");
    System.out.println(result.getDouble(2));
    }
    result.close();
    
    }
    catch(ClassNotFoundException cnfe)
    {
    System.out.println(cnfe); 
    }
    catch(SQLException sqle)
    {
    System.out.println(sqle);
    }
    }

    public static void main(String[] args) 
    {
        DBConnect db=new DBConnect();
    }

}
