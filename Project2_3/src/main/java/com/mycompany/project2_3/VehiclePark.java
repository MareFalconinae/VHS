
package com.mycompany.project2_3;
import java.util.Date;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VehiclePark {
    ArrayList<Vehicle> AllVehiclelist = new ArrayList<>(); 
    ArrayList<Vehicle> AvailableVehicles= new ArrayList<>();
    ArrayList<Vehicle> BookedVehicles = new ArrayList<>();
    ArrayList<Vehicle> RentedVehicles = new ArrayList<>();
    ArrayList<String> Customers = new ArrayList<>();
    Scanner scn=new Scanner(System.in);
public void displayAllVehicles(){
    for(Vehicle v:AllVehiclelist){
        System.out.println("Type: "+v.getClass());
        System.out.println("id: "+v.getId());
        System.out.println("Plate Number: "+v.getPlateNumber());
        System.out.println("Number of Tires: "+v.getNumberOfTires());
        System.out.println("Daily Fee: "+v.getDailyFee());
    }
}
    
public void displayAvailableVehicles(){
    for(Vehicle v:AvailableVehicles){
        System.out.println("Type: "+v.getClass());
        System.out.println("id: "+v.getId());
        System.out.println("Plate Number: "+v.getPlateNumber());
        System.out.println("Number of Tires: "+v.getNumberOfTires());
        System.out.println("Daily Fee: "+v.getDailyFee());
    }
}
public void addVehicle(int id,int plateno,String model,double fee){    
    String color;
    Double lc;
    switch(model){
        case "SportCar":
            System.out.println("Choose car's color:");
            color=scn.nextLine();
            System.out.println("Choose horse power:");
            double hp=scn.nextDouble();
            Vehicle sc=new CarSport(id,plateno,4,fee,color,2,2,hp);
            AllVehiclelist.add(sc);
            break;
        case "SUV":
            System.out.println("Choose car's color:");
            color=scn.nextLine();
            System.out.println("Choose wheel's drive:");
            String wd=scn.nextLine();
            Vehicle suv=new CarSUV(id,plateno,4,fee,color,5,4,wd);
            AllVehiclelist.add(suv);
            break;
        case "SW":
            System.out.println("Choose car's color:");
            color=scn.nextLine();
            System.out.println("Choose loading capasity:");
            lc=scn.nextDouble();
            Vehicle sw=new CarSW(id,plateno,4,fee,color,5,4,lc);
            AllVehiclelist.add(sw);
            break;
        case "TransportationTruck":
            System.out.println("Choose loading capasity:");
            lc=scn.nextDouble();
            System.out.println("is Abroad?");
            Boolean ia=scn.nextBoolean();
            Vehicle tt=new TruckTransportation(id,plateno,6,fee,lc,ia);
            AllVehiclelist.add(tt);
            break;
        case "SmallTruck":
            System.out.println("Choose loading capasity:");
            lc=scn.nextDouble();
            Vehicle st=new TruckSmall(id,plateno,4,fee,lc);
            AllVehiclelist.add(st);
            break;
    }
}
public void removeVehicle(int id){
    for(Vehicle v:AllVehiclelist){
        if(v.getId()==id){
           AllVehiclelist.remove(v); 
        }
    }
}
public void bookVehicle(CarSport sc,Date s,Date f){
if(AvailableVehicles.contains(sc)){
    try{
        sc.bookMe(AvailableVehicles,BookedVehicles,s,f);
}   
    catch(SorryWeDontHaveThatOneException e){
    }
}
}
public void bookVehicle(Truck t,Date s,Date f){
if(AvailableVehicles.contains(t)){
    try{
        t.bookMe(AvailableVehicles,BookedVehicles,s,f);
}   
    catch(SorryWeDontHaveThatOneException e){
    }
}
}
public void cancelVehicle(CarSport sc,Date s,Date c){
if(AvailableVehicles.contains(sc)){
    try{
        sc.cancelMe(AvailableVehicles,BookedVehicles,s,c);
}   
    catch(NoCancellationYouMustPayException e){
    }
}
}
public void cancelVehicle(Truck t,Date s,Date c){
if(AvailableVehicles.contains(t)){
    try{
        t.cancelMe(AvailableVehicles,BookedVehicles,s,c);
}   
    catch(NoCancellationYouMustPayException e){
    }
}
}
public void rentVehicle(Vehicle v,Date s,Date f){
if(AvailableVehicles.contains(v)){
    try{
        v.rentMe(AvailableVehicles,RentedVehicles,s,f);
}   
    catch(SorryWeDontHaveThatOneException e){
    }
}
}
public void dropVehicle(Vehicle v){
if(AvailableVehicles.contains(v)){
    v.dropMe(AvailableVehicles,RentedVehicles);
}
}
public void load(CarSW sw,double lc){
if(AvailableVehicles.contains(sw)){
    try{
        sw.loadMe(lc);
}   
    catch(OverWeightException e){
    }
}
}
public void load(Truck t,double lc){
if(AvailableVehicles.contains(t)){
    try{
        t.loadMe(lc);
}   
    catch(OverWeightException e){
    }
}
}
public void dailyReport(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("Report.txt"));
            for(Vehicle v:AllVehiclelist){
            writer.write("\n Type:"+v.getClass());
            writer.write("\n id: "+v.getId());
            writer.write("\n Plate Number: "+v.getPlateNumber());
            writer.write("\n Number of Tires: "+v.getNumberOfTires());
            writer.write("\n Daily Fee: "+v.getDailyFee());
            }
        }catch (IOException ex) {
            Logger.getLogger(VehiclePark.class.getName()).log(Level.SEVERE, null, ex);
        }
}       
}

