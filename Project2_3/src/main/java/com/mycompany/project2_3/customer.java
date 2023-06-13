package com.mycompany.project2_3;
import java.util.Scanner;
import java.util.Date;
public class customer {
    VehiclePark vp=new VehiclePark();
    Scanner scn=new Scanner(System.in);
public void CustomerPanel(){
    while(true){
        System.out.println("Welcome customer! please tell us your name!");
        String customername = scn.next();
        vp.Customers.add(customername);
        System.out.println("Welcome again " + customername + "! what you want to do?");
        System.out.println("1-Display all vehicles");
        System.out.println("2-Display available vehicles ");
        System.out.println("3-Display availible vehicles by type");
        System.out.println("4-Book vehicle");
        System.out.println("5-Cancel booking");
        System.out.println("6-Rent a vehicle");
        System.out.println("7-Drop a vehicle");
        System.out.println("8-Quit");    
    int c=scn.nextInt();
    int id;
    Date s;
    Date f;
    switch(c){
        case 1:
            vp.displayAllVehicles();
        case 2:
            vp.displayAvailableVehicles();
        case 3:         
            
        case 4:  
            System.out.println("enter id:");
            id=scn.nextInt();
            System.out.println("enter beginning date:");
            s=new Date();
            System.out.println("enter final date");
            f=new Date();
            for(Vehicle v : vp.AllVehiclelist){
            if(v.getId()==id){
            if(v.getClass()==CarSport.class){
            vp.bookVehicle((CarSport)v,s,f);
            }
            else if(v.getClass()==Truck.class){
            vp.bookVehicle((Truck)v,s,f);    
            }
            else{
            System.out.println("Not bookable");    
            }    
            }
            }
        case 5:
            System.out.println("enter id:");
            id=scn.nextInt();
            System.out.println("enter beginning date:");
            s=new Date();
            System.out.println("enter canceling date:");
            f=new Date();
            for(Vehicle v : vp.AllVehiclelist){
            if(v.getId()==id){
            if(v.getClass()==Truck.class){
            vp.cancelVehicle((Truck)v,s,f);
            }
            else{
            vp.cancelVehicle((CarSport)v,s,f);
            }
            }
            }
        case 6:
            System.out.println("enter id:");
            id=scn.nextInt();
            System.out.println("enter beginning date:");
            s=new Date();
            System.out.println("enter final date:");
            f=new Date();
            for(Vehicle v : vp.AllVehiclelist){
            if(v.getId()==id){ 
            vp.rentVehicle(v,s,f);
            }
            }
        case 7:
            System.out.println("enter id:");
            id=scn.nextInt();
            for(Vehicle v : vp.AllVehiclelist){
            if(v.getId()==id){ 
            vp.dropVehicle(v);
            }
            }
        case 8:
            System.exit(0);
    }   
    }    
}        
}
