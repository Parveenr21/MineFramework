package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SQLhelper{
	
	private static SQLhelper DBConInstance;
	public  Connection con;
    private  final String Driver = "oracle.jdbc.driver.OracleDriver";
    private  String hostname;
    private  String SID;
    private   String ConnectionString = "jdbc:oracle:thin:@"+hostname+":1521:"+SID;
    private   String username = "UserID";
    private   String password = "UserPAsswd";

    
    /**
     * Making constructor private
     */
    
    private SQLhelper(String hostname,String SID, String username, String password){
    	this.hostname=hostname;
    	this.SID=SID;
    	this.username=username;
    	this.password=password;
    }
    
    
    /**
     * create Database object
     */
     public static SQLhelper Database(String hostname,String SID, String username, String password) {
    
    	if(DBConInstance==null)
    	{
    		DBConInstance = new SQLhelper(hostname,SID,username,password);
    	}
    	return DBConInstance;
    }

    
     /**
     * to load the database base driver
     * @return a database connection
     * @throws SQLException throws an exception if an error occurs
     */
    public Connection loadDriver() throws SQLException {
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        con = DriverManager.getConnection(ConnectionString, username, password);
        return con;
    }

    /**
     * to get a result set of a query
     * @param query custom query
     * @return a result set of custom query
     * @throws SQLException throws an exception if an error occurs
     */
     ResultSet getResultSet(String query) throws SQLException { //this method should be default or even public because this mehod calling needs object
        Connection con = loadDriver();
        ResultSet rs;
        PreparedStatement st;
              
       //con.getMetaData();
      
        st = con.prepareStatement(query);
          	  rs = st.executeQuery();
    	   return rs;
      
    }

   
    
    
    
    
    
    
    /* *//**
     * to run an update query such as update, delete
     * @param query custom query
     * @throws SQLException throws an exception if an error occurs
     *//*
    public static void runQuery(String query) throws SQLException {
        Connection con = loadDriver();
        ResultSet rs;
        PreparedStatement st = con.prepareStatement(query);
        st.executeUpdate();
    }*/
	
	
  
}