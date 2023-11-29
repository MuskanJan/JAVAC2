package com.practice;

public class User {
	
	
	String userName;
	int userPassword;
	
	public String singIn() {
	
		return "sing in successfully";
	}

	
	public String singOut() { 
		
		return "sing out successfully";
	}
	
	public User(String UserName, int UserPassword) {
	
	this.userName= UserName;
	this.userPassword= UserPassword;
	
	}
	public static void main(String[] args) {
		
    User nUser = new User ( "Muskan", 263);
	
    System.out.println(nUser.userName);
    System.out.println(nUser.userPassword);
    System.out.println(nUser.singIn());
	System.out.println(nUser.singOut());
	
	
	}

}
