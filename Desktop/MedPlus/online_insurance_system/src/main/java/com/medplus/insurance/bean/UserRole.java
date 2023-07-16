package com.medplus.insurance.bean;

public class UserRole {
private String username;
private String password;
private String role;

//@Override
//public String toString() {
//	return "UserRole [username=" + username + ", password=" + password + ", role=" + role + "]";
//}
public UserRole() {
	super();
	// TODO Auto-generated constructor stub
}
public UserRole(String username, String password, String role) {
	super();
	this.username = username;
	this.password = password;
	this.role = role;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public UserRole(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public void setRole(String role) {
	this.role = role;
}
}
