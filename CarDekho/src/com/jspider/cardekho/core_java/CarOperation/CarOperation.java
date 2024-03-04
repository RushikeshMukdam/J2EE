package com.jspider.cardekho.core_java.CarOperation;
import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.cardekho.core_java.entity.Car;
public class CarOperation {
	ArrayList<Car> cars = new ArrayList<Car>();
	  
    public void addCar(Scanner sc){
    
     Car car = new Car();

    System.out.println("Enter Car ID");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Car Name");
    String name = sc.nextLine();
    System.out.println("Enter Car Price");
    double price = sc.nextDouble();
    
      car.setId(id);
      car.setName(name);
      car.setPrice(price);
      cars.add(car);
      System.out.println("Car Added!!!");
    
    }
    
    
   public void searchCar(Scanner sc){
      
     boolean flag =false;
     System.out.println("Enter Car ID");
     int id = sc.nextInt();
       
      for(Car car : cars)
      {
        if(car.getId() == id){
          System.out.println(car);
            flag = true;
            break;
        }
         
        if(!flag){
           
           System.out.println("Cars Not Found");
        }
        
         
      }
   }




     public void fetchAllCar(){
  
    if(cars.size()>0){
      for(Car car : cars){
        System.out.println(car);
      }
    }
    else{
      System.out.println("Cars Not Found !!!!");
    }
  }
  
    public void removeCar(Scanner sc){
  
    boolean flag=false;
    System.out.println("Enter Car ID");
    int id = sc.nextInt();
    
    for(Car car : cars){
      
        if(car.getId() == id){
          flag= true;
          cars.remove(car);
          System.out.println("Delete Car Succefully!!!!");
            
            break;
        }
    }
    
    if(!flag){
      System.out.println("Car Not Found!!!!");
    }
 }

}
