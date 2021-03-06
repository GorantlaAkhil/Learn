package com.visualize.bean;

import java.beans.JavaBean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@JavaBean
@Data
@Getter
@Setter
@AllArgsConstructor
public class InformationSchema {
	
	private String table_schema;
	private String constraint_name;
	public InformationSchema() {
		super();
	}
	@Override
	public String toString() {
		return "InformationSchema [table_schema=" + table_schema + ", constraint_name=" + constraint_name
				+ ", table_name=" + table_name + ", column_name=" + column_name + ", foreign_table_schema="
				+ foreign_table_schema + ", foreign_table_name=" + foreign_table_name + ", foreign_table_column="
				+ foreign_table_column + "]";
	}
	private String table_name;
	private String column_name;
	private String foreign_table_schema;
	public InformationSchema(String table_schema, String constraint_name, String table_name, String column_name,
			String foreign_table_schema, String foreign_table_name, String foreign_table_column) {
		super();
		this.table_schema = table_schema;
		this.constraint_name = constraint_name;
		this.table_name = table_name;
		this.column_name = column_name;
		this.foreign_table_schema = foreign_table_schema;
		this.foreign_table_name = foreign_table_name;
		this.foreign_table_column = foreign_table_column;
	}
	private String foreign_table_name;
	private String foreign_table_column;
	public String getTable_schema() {
		return table_schema;
	}
	public void setTable_schema(String table_schema) {
		this.table_schema = table_schema;
	}
	public String getConstraint_name() {
		return constraint_name;
	}
	public void setConstraint_name(String constraint_name) {
		this.constraint_name = constraint_name;
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
	public String getForeign_table_schema() {
		return foreign_table_schema;
	}
	public void setForeign_table_schema(String foreign_table_schema) {
		this.foreign_table_schema = foreign_table_schema;
	}
	public String getForeign_table_name() {
		return foreign_table_name;
	}
	public void setForeign_table_name(String foreign_table_name) {
		this.foreign_table_name = foreign_table_name;
	}
	public String getForeign_table_column() {
		return foreign_table_column;
	}
	public void setForeign_table_column(String foreign_table_column) {
		this.foreign_table_column = foreign_table_column;
	}

}
