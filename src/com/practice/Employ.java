package com.practice;

public class Employ {
	
	String empName;
    int empId;
	String empAddress;
	int empSalary;
	String empPositon;
	
	
	public String HelpCustomers() {
	
	return" help customers to  find information";
	
	}
	
	public String CallCustomers() {
		
	return" call customers every day";
	}
	
	 public Employ(String Empname, int Empid, String Empaddress,  int Empsalary, String Emppositon) {
	
	this.empName = Empname;
	this.empId = Empid;
	this.empAddress = Empaddress;
	this.empSalary = Empsalary; 
	this.empPositon = Emppositon;
	
	 }
	public static void main(String[] args) {
		
	Employ Nemp = new  Employ("Fardin" , 210, "WS", 1020,"SoftwareDeveloper");	
	Employ Oemp = new Employ("Muskan", 021,"PK", 2000, "new Sd");	
	
	System.out.println(Nemp.empName);	
	System.out.println(Nemp.empId);	
	System.out.println(Nemp.empAddress);	
	System.out.println(Nemp.empSalary);	
	System.out.println(Nemp.empPositon);	
    System.out.println(Nemp.HelpCustomers());
    System.out.println(Nemp. CallCustomers());
    
    
    System.out.println(Oemp.empName);	
	System.out.println(Oemp.empId);	
	System.out.println(Oemp.empAddress);	
	System.out.println(Oemp.empSalary);	
	System.out.println(Oemp.empPositon);	
    System.out.println(Oemp.HelpCustomers());
    System.out.println(Oemp. CallCustomers());
    
    
    
    
    
    
    
    
    
    
    
	}

}
