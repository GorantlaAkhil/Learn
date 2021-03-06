package com.visualize.bean;

import org.springframework.stereotype.Component;

@Component
public class Table_Details {
	
	private String table_schema;
	private String table_name;
	private String column_name;
	private String constraint_type;
	public String getTable_schema() {
		return table_schema;
	}
	public void setTable_schema(String table_schema) {
		this.table_schema = table_schema;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getColumn_name() {
		return column_name;
	}
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	public String getConstraint_type() {
		return constraint_type;
	}
	public void setConstraint_type(String constraint_type) {
		this.constraint_type = constraint_type;
	}

}
