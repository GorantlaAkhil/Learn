package com.visualize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.visualize.bo.SchemaTables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
public class VisualizerApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(VisualizerApplication.class, args);
		
	}

}
