package com.lesson5part2assignment6.assignment6;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class SampleSingleton {

	private static Connection conn = null;
	
	private static SampleSingleton instance = null;

	private SampleSingleton() {};
	
	public static SampleSingleton getInstance() {

		if (instance == null) {
			synchronized (SampleSingleton.class) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}
	
}

public class Assignment6Application {

	public static void main(String[] args) {
		
	}

}
