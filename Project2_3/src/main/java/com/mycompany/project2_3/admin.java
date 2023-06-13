 package com.mycompany.project2_3;
import java.util.Scanner;
public class admin { 
    VehiclePark vp=new VehiclePark();
    Scanner scn = new Scanner(System.in);
public void AdminPanel(){
    while(true){
            System.out.println("Welcome Admin!Please choose the operation you want to do:");     
            System.out.println("1 - Display all Vehicles:");      
            System.out.println("2 - Display available vehicles by date:");
            System.out.println("3 - Add vehicle:");
            System.out.println("4 - Remove vehicle:");
            System.out.println("5 - Create report:");
            System.out.println("6 - Quit:");                
        int c=scn.nextInt(); 
        switch(c){
            case 1:
                vp.displayAllVehicles();
                break;
            case 2:
                vp.displayAvailableVehicles();
                break;
            case 3:
                vp.addVehicle(v);
                break;
            case 4:
                vp.removeVehicle(v);
                break;
            case 5:
                vp.dailyReport();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid number");
                break;
        }
    }
}
}
