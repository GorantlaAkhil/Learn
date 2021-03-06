package com.visualize.bo;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.visualize.bean.InformationSchema;
import com.visualize.bean.Table_Details;
@Component
public class SchemaTables {
	/*
	 * @Override public void run(String... args) throws Exception { List<String>
	 * tbl_names =getAllTables();
	 * 
	 * ArrayList<Table_Details> tabl_content=tabl_content(tbl_names);
	 * for(Table_Details i:tabl_content) { System.out.println(i);
	 * 
	 * } ArrayList<InformationSchema> fKey=refTable(tbl_names);
	 * for(InformationSchema i:fKey) {
	 * System.out.println(i.getTable_name()+" "+i.getColumn_name()+" "+i.
	 * getConstraint_name()+" "+i.getForeign_table_column());
	 * 
	 * }
	 * 
	 * }
	 */
	//modify it to retuen List<String>
	public List<String> getAllTables(String schemaName) throws SQLException {
		
		 List<String> table_name=new ArrayList<String>();
		
		 String mysqlUrl = "jdbc:postgresql://localhost:5432/postgres?currentSchema="+schemaName;
	     Connection con = DriverManager.getConnection(mysqlUrl, "postgres", "akhil");
	     Statement stmt = con.createStatement();
	     ResultSet rs = stmt.executeQuery("SELECT tablename\n"
		      		+ "FROM pg_catalog.pg_tables WHERE schemaname != 'pg_catalog' AND \n"
		      		+ "    schemaname != 'information_schema'");
	     while(rs.next()) {
	         table_name.add(rs.getString(1));
	        
	      }
          
	     con.close();
          
	     return table_name;
		
	}
	//End of all tables
   public ArrayList<Table_Details> all_Tabl_Content(List<String> tbl_name) throws Exception{
	   String mysqlUrl = "jdbc:postgresql://localhost:5432/postgres?currentSchema=sample";
	     Connection con = DriverManager.getConnection(mysqlUrl, "postgres", "akhil");
	     Statement stmt = con.createStatement();
	   ArrayList<Table_Details> tbl_dtls =new ArrayList<Table_Details>();
	   Iterator itr = tbl_name.iterator();
	   while(itr.hasNext()) {
		   
		   String table_Name=(String) itr.next();
		   String sqlstatement ="SELECT a.table_schema,a.table_name,a.column_name,b.constraint_type from information_schema.constraint_column_usage as a JOIN information_schema.table_constraints as b ON a.table_name=b.table_name Where a.table_name='"+table_Name+"'";
		   ResultSet rs1 = stmt.executeQuery(sqlstatement);
		   ResultSetMetaData rsmd = rs1.getMetaData();
           while (rs1.next()) {
               for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            	   Table_Details t = new Table_Details();
            	   t.setTable_schema(rs1.getString(i++));
            	   t.setTable_name(rs1.getString(i++));
            	   t.setColumn_name(rs1.getString(i++));
            	   t.setConstraint_type(rs1.getString(i++));
            	   tbl_dtls.add(t);
               }
           }
             
	   }
	   con.close();
	   return tbl_dtls;
   }
   
   public ArrayList<Table_Details> getTblContent(String schemaName,String tbl_name) throws Exception{
	   String mysqlUrl = "jdbc:postgresql://localhost:5432/postgres?currentSchema="+schemaName;
	     Connection con = DriverManager.getConnection(mysqlUrl, "postgres", "akhil");
	     Statement stmt = con.createStatement();
	     ArrayList<Table_Details> tbl_dtls =new ArrayList<Table_Details>();
	
		   
		   String sqlstatement ="SELECT a.table_schema,a.table_name,a.column_name,b.constraint_type from information_schema.constraint_column_usage as a JOIN information_schema.table_constraints as b ON a.table_name=b.table_name Where a.table_name='"+tbl_name+"'";
		   ResultSet rs1 = stmt.executeQuery(sqlstatement);
		   ResultSetMetaData rsmd = rs1.getMetaData();
           while (rs1.next()) {
               for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            	   Table_Details t=new Table_Details();
            	   t.setTable_schema(rs1.getString(i++));
            	   t.setTable_name(rs1.getString(i++));
            	   t.setColumn_name(rs1.getString(i++));
            	   t.setConstraint_type(rs1.getString(i++));
            	   tbl_dtls.add(t);
               }
           }
             
           con.close();
	   return tbl_dtls;
   }
   
   //Foreighn Key
   public ArrayList<InformationSchema> allRefTable(List<String> tbl_name) throws Exception{
	   String mysqlUrl = "jdbc:postgresql://localhost:5432/postgres?currentSchema=sample";
	     Connection con = DriverManager.getConnection(mysqlUrl, "postgres", "akhil");
	     Statement stmt = con.createStatement();
	   ArrayList<InformationSchema> tbl_dtls =new ArrayList<InformationSchema>();
	   Iterator itr = tbl_name.iterator();
	   while(itr.hasNext()) {
		   
		   String table_Name=(String) itr.next();
		   String sqlstatement ="SELECT tc.table_schema,tc.constraint_name,tc.table_name,kcu.column_name,ccu.table_schema AS foreign_table_schema,ccu.table_name AS foreign_table_name,ccu.column_name AS foreign_column_name FROM information_schema.table_constraints AS tc JOIN information_schema.key_column_usage AS kcu ON tc.constraint_name = kcu.constraint_name AND tc.table_schema = kcu.table_schema JOIN information_schema.constraint_column_usage AS ccu ON ccu.constraint_name = tc.constraint_name AND ccu.table_schema = tc.table_schema WHERE tc.constraint_type = 'FOREIGN KEY' AND tc.table_name='"+table_Name+"'";
		   ResultSet rs1 = stmt.executeQuery(sqlstatement);
		   ResultSetMetaData rsmd = rs1.getMetaData();
           while (rs1.next()) {
               for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            	   InformationSchema inf = new InformationSchema();
            	   inf.setTable_schema(rs1.getString(i++));
            	   inf.setConstraint_name(rs1.getString(i++));
            	   inf.setTable_name(rs1.getString(i++));
            	   inf.setColumn_name(rs1.getString(i++));
            	   inf.setForeign_table_schema(rs1.getString(i++));
            	   inf.setForeign_table_name(rs1.getString(i++));
            	   inf.setForeign_table_column(rs1.getString(i++));
            	   tbl_dtls.add(inf);
               }
           }
             
	   }
	   con.close();
	   return tbl_dtls;
   }
   public ArrayList<InformationSchema> refTable(String schemaName,String tbl_name) throws Exception{
	   String mysqlUrl = "jdbc:postgresql://localhost:5432/postgres?currentSchema="+schemaName;
	     Connection con = DriverManager.getConnection(mysqlUrl, "postgres", "akhil");
	     Statement stmt = con.createStatement();
	   ArrayList<InformationSchema> tbl_dtls =new ArrayList<InformationSchema>();
		   
		   
		   String sqlstatement ="SELECT tc.table_schema,tc.constraint_name,tc.table_name,kcu.column_name,ccu.table_schema AS foreign_table_schema,ccu.table_name AS foreign_table_name,ccu.column_name AS foreign_column_name FROM information_schema.table_constraints AS tc JOIN information_schema.key_column_usage AS kcu ON tc.constraint_name = kcu.constraint_name AND tc.table_schema = kcu.table_schema JOIN information_schema.constraint_column_usage AS ccu ON ccu.constraint_name = tc.constraint_name AND ccu.table_schema = tc.table_schema WHERE tc.constraint_type = 'FOREIGN KEY' AND tc.table_name='"+tbl_name+"'";
		   ResultSet rs1 = stmt.executeQuery(sqlstatement);
		   ResultSetMetaData rsmd = rs1.getMetaData();
           while (rs1.next()) {
               for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            	   InformationSchema inf = new InformationSchema();
            	   inf.setTable_schema(rs1.getString(i++));
            	   inf.setConstraint_name(rs1.getString(i++));
            	   inf.setTable_name(rs1.getString(i++));
            	   inf.setColumn_name(rs1.getString(i++));
            	   inf.setForeign_table_schema(rs1.getString(i++));
            	   inf.setForeign_table_name(rs1.getString(i++));
            	   inf.setForeign_table_column(rs1.getString(i++));
            	   tbl_dtls.add(inf);
               }
           }
             
	   
	   con.close();
	   return tbl_dtls;
   }
}
