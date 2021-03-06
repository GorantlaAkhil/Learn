package com.visualize.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visualize.bean.InformationSchema;
import com.visualize.bean.Table_Details;
import com.visualize.bo.SchemaTables;

@RestController
public class GetSchemaTablesController {
	@Autowired
	private SchemaTables schemaTabls;
	
	@GetMapping("/getSchemaTables/{schemaName}")
	public List<String> getSchemaTbls(@PathVariable String schemaName) throws SQLException{
	  return schemaTabls.getAllTables(schemaName);
	}
	
	@GetMapping("/getTableContent/{schemaName}/{tableName}")
	public  ArrayList<Table_Details> getTblContent(@PathVariable String schemaName,@PathVariable String tableName) throws Exception{
		return schemaTabls.getTblContent(schemaName, tableName);
	}
	
	@GetMapping("/getRefContent/{schemaName}/{tableName}")
	public ArrayList<InformationSchema> getRefData(@PathVariable String schemaName,@PathVariable String tableName)  throws Exception{
		return schemaTabls.refTable(schemaName,tableName);
	}
	

}
