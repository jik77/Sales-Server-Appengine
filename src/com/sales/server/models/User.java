package com.sales.server.models;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class User{
	@Id
	public String id;
	public String firstName;
	public String lastName;
	public String email;
	public String password;
	public String type;
	public String role;

}