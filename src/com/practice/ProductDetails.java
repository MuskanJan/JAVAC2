package com.practice;

public class ProductDetails {

   public static void main(String[] args) {
   Product  obj1 = new Product();
   Product obj2 = new Product(); 	
   Product obj3 = new Product();	
	
   obj1.setProductName("Mono");
    System.out.println(obj1.getProductName());	
	obj1.setProductId(102);	
	System.out.println(obj1.getProductId());
	obj1.setProductPrice(200);
	System.out.println(obj1.getProductPrice());
	obj1.setProductIExpirationDate("2024");
	System.out.println(obj1.getProductIExpirationDate());
	
	System.out.println("/n");
	
	obj2.setProductName("milk");
	System.out.println(obj2.getProductName());
	obj2.setProductId(02);
	System.out.println(obj2.getProductId());
	obj2.setProductPrice(15);
	System.out.println(obj2.getProductPrice());
	obj2.setProductIExpirationDate("2025");
	System.out.println(obj2.getProductIExpirationDate());
	
	System.out.println("/n");
	
	obj3.setProductName("omo");
	System.out.println(obj3.getProductName());
	obj3.setProductId(30);
	System.out.println(obj3.getProductId());
	obj3.setProductPrice(300);
	System.out.println(obj3.getProductPrice());
	obj3.setProductIExpirationDate("2026");
	System.out.println(obj3.getProductIExpirationDate());
	
	
	
	}

}
