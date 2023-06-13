
package com.mycompany.project2_3;
import java.util.Date;
import java.util.ArrayList;
import java.io.File;
public class VehiclePark {
    ArrayList<Vehicle> AllVehiclelist = new ArrayList<>(); 
    ArrayList<Vehicle> AvailableVehicles= new ArrayList<>();
    ArrayList<Vehicle> BookedVehicles = new ArrayList<>();
    ArrayList<Vehicle> RentedVehicles = new ArrayList<>();
    ArrayList<String> Customers = new ArrayList<>();

public void displayAllVehicles(){
    for(Vehicle v:AllVehiclelist){
        System.out.println("Type: "+v.getClass());
        System.out.println("id: "+v.getId());
        System.out.println("Plate Number: "+v.getPlateNumber());
        System.out.println("Number of Tires: "+v.getNumberOfTires());
        System.out.println("Daily Fee: "+v.getDailyFee());
    }
}
    
public void AvailableVehicles(){
    for(Vehicle v:AvailableVehicles){
        System.out.println("Type: "+v.getClass());
        System.out.println("id: "+v.getId());
        System.out.println("Plate Number: "+v.getPlateNumber());
        System.out.println("Number of Tires: "+v.getNumberOfTires());
        System.out.println("Daily Fee: "+v.getDailyFee());
    }
}
public void addVehicle(Vehicle v){
AllVehiclelist.add(v);
AvailableVehicles.add(v);    
}
public void removeVehicle(Vehicle v){
AllVehiclelist.remove(v);   
AvailableVehicles.remove(v);
BookedVehicles.remove(v);
RentedVehicles.remove(v);
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
    BufferWriter writer=new BufferWritter("Report.txt");
}
}
