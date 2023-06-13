+package com.mycompany.project2_3;
import java.util.Scanner;
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
    switch(c){
        case 1:
            vp.displayAllVehicles();
        case 2:
            vp.displayAvailableVehicles();
        case 3:         
        
        case 4:
            vp.bookVehicle(sc,s,f);
            vp.bookVehicle(t,s,f);
        case 5:
            vp.cancelVehicle(sc,s,c);
            vp.cancelVehicle(t,s,c);
        case 6:
            vp.rentVehicle(v,s,f);
        case 7:
            vp.dropVehicle(v);
        case 8:
            System.exit(0);
    }   
    }    
}        
