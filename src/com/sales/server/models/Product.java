package com.sales.server.models;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Product{
	@Id
	public static String id;
	public static int sno;
	public static String proRefNumber;
	public static String productName;
	public static float price; 
	public static int quantity;
	public static String sname;
	public static String sphone;
	
}