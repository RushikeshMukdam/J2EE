package com.jspider.cardekho.core_java.Mainmenu;

import java.util.Scanner;

import com.jspider.cardekho.core_java.CarOperation.CarOperation;

public class MainMenu {
	private static CarOperation carop = new CarOperation();
	  
	  
	  public static void main(String[] args) {
	  
	   
	    boolean flag=true;
	    while(flag){
	  
	    System.out.println("====== Car Menu ======\n"
	    +"1. Add a car\n"
	    +"2. Search car\n"
	    +"3. View all car\n"
	    +"4. Delete car\n"
	    +"5. Exit\n"
	    +"========================");

	   Scanner sc = new Scanner(System.in);
	    int choice = sc.nextInt();

	    switch(choice){

	      case 1:
	        System.out.println("Enter Car Deatils\n"
	        +"——————————————————————-");
	        
	         carop.addCar(sc);
	         break;
	      case 2:
	        System.out.println("Search Car\n "
	        +"———————————————————————-");
	        carop.searchCar(sc);
	        break;
	      case 3:
	        System.out.println("View All Car\n"
	        +"——————————————————————-");
	        carop.fetchAllCar();
	        break;
	      case 4:
	         System.out.println("Delete Any Car At Any Time\n" 
	         +"——————————————————————-");
	         carop.removeCar(sc);
	         break;
	      case 5:
	    	  flag=false;
	    	  System.out.println("Thank you for Visting !!!");
	    	  break;
	      default:
	        System.out.println("Invalid Choice Check once");
	        
	        
	       }
	       
	    }
	  }

}
