package cn.edu.xijing.minchong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccessObject {
	String connString="";
	Connection conn=null;
	Statement st=null;
	public DataAccessObject (String serverName,String dbName,String userName,String password) throws ClassNotFoundException, SQLException {
		connString="jdbc:sqlserver://"+serverName+";databaseName="+dbName+"";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn=DriverManager.getConnection(connString, userName, password);
		st=conn.createStatement();
		
	}
	
	public int ExecuteUpdate(String sql) throws SQLException{
		int result=st.executeUpdate(sql);
		return result;
	}
	
	public ResultSet ExecuteQuery(String sql) throws SQLException{
		ResultSet rs=st.executeQuery(sql);
		return rs;
	}
}

