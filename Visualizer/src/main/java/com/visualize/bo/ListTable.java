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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.visualize.bean.InformationSchema;

@Component
public class ListTable {
	/*
	 * public void table() throws Exception{
	 * 
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * //DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //Getting the
	 * connection
	 * 
	 * ArrayList<InformationSchema> table_Mtdata =new
	 * ArrayList<InformationSchema>(); List<String> table_name=new
	 * ArrayList<String>();
	 * 
	 * String mysqlUrl =
	 * "jdbc:postgresql://localhost:5432/postgres?currentSchema=sample"; Connection
	 * con = DriverManager.getConnection(mysqlUrl, "postgres", "akhil");
	 * System.out.println("Connection established......"); //Creating a Statement
	 * object Statement stmt = con.createStatement(); //Retrieving the data
	 * ResultSet rs = stmt.executeQuery("SELECT tablename\n" +
	 * "FROM pg_catalog.pg_tables WHERE schemaname != 'pg_catalog' AND \n" +
	 * "    schemaname != 'information_schema'");
	 * System.out.println("Tables in the current database: "); while(rs.next()) {
	 * table_name.add(rs.getString(1)); System.out.println(); } //to retrieve
	 * metadata Iterator iter = table_name.iterator(); while(iter.hasNext()) {
	 * String table_Name=(String) iter.next(); ResultSet rs1 = stmt.
	 * executeQuery("SELECT tc.table_schema,tc.constraint_name,tc.table_name,kcu.column_name,ccu.table_schema AS foreign_table_schema,ccu.table_name AS foreign_table_name,ccu.column_name AS foreign_column_name FROM information_schema.table_constraints AS tc  JOIN information_schema.key_column_usage AS kcu ON tc.constraint_name = kcu.constraint_name AND tc.table_schema = kcu.table_schema JOIN information_schema.constraint_column_usage AS ccu ON ccu.constraint_name = tc.constraint_name AND ccu.table_schema = tc.table_schema WHERE tc.constraint_type = 'FOREIGN KEY'"
	 * ); ResultSetMetaData rsmd = rs1.getMetaData(); while (rs1.next()) { for (int
	 * i = 1; i <= rsmd.getColumnCount(); i++) { InformationSchema is = new
	 * InformationSchema(); is.setTable_schema(rs1.getString(i++));
	 * is.setConstraint_name(rs1.getString(i++));
	 * is.setTable_name(rs1.getString(i++)); is.setColumn_name(rs1.getString(i++));
	 * is.setForeign_table_schema(rs1.getString(i++));
	 * is.setForeign_table_name(rs1.getString(i++));
	 * is.setForeign_table_column(rs1.getString(i++)); table_Mtdata.add(is); } } //}
	 * for(InformationSchema c:table_Mtdata) { System.out.println(c.toString()); }
	 * 
	 * 
	 * }//
	 * 
	 * 
	 * 
	 */}
