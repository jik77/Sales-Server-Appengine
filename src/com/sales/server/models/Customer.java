package com.sales.server.models;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Customer{
	@Id
	public static String id;
	public static String pid;
	public static String name;
	public static String phone;
	public static String city;
	public static String state;
	
}